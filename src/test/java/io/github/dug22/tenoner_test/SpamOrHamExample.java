package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.StringColumn;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.NaiveBayes;
import io.github.dug22.tenoner_test.utils.BagOfWordsUtils;

import java.util.*;

public class SpamOrHamExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private NaiveBayes naiveBayes;
    private final List<String> wordCountColumns = new ArrayList<>();

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/spam_or_ham.csv");
        StringColumn textColumn = dataFrame.stringColumn("text");
        textColumn = textColumn.apply(BagOfWordsUtils::cleanText);
        dataFrame.replaceColumn(dataFrame.getColumnIndex("text"), textColumn);
        Set<String> vocab = BagOfWordsUtils.buildVocab(textColumn.getValues());
        BagOfWordsUtils.createVectorColumns(dataFrame, textColumn, vocab);
        dataFrame = Tenoner.labelEncoder()
                .setDataFrame(dataFrame)
                .encodeAsIntegers("label");
        dataFrame.renameColumn(Map.of("label","Is Spam"));
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleIntegerDataset(dataFrame);
        for(String column : dataFrame.columnNames()){
            if(column.contains("_count")){
                wordCountColumns.add(column);
            }
        }
        String[] finalCountColumns = wordCountColumns.toArray(new String[0]);
        dataset = dataset.inputs(finalCountColumns)
                .output("Is Spam")
                .build()
                .split(0.8, 42);
        out("=== Defining Our Dataset ===");
        out("Training Size: " + dataset.getTrainingDatasetFromSplit().getDataPoints().size());
        out("Test Size: " + dataset.getTestDatasetFromSplit().getDataPoints().size());
        out();
    }

    @Override
    protected void defineModel() {
        out("=== Defining Our Model ===");
        out("Model of Choice: Naive Bayes" );
        out();
        naiveBayes = Tenoner.naiveBayes();
    }

    @Override
    protected void trainAndEvaluateModel() {
        out("=== Training and Evaluating Our Model ===");
        DatasetFactory.DoubleIntegerDataset trainingDataset = dataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleIntegerDataset testDataset = dataset.getTestDatasetFromSplit();
        naiveBayes.train(trainingDataset);
        List<Integer> predictions = naiveBayes.test(testDataset);
        naiveBayes.evaluateAccuracy(testDataset.getDataPoints(), predictions);
        naiveBayes.summary();
        out();
    }

    @Override
    protected void testPredictions() {
        out("=== Model's Predictions ===");
        List<String> customMessages = Arrays.asList(
                "WINNER! Claim your free prize money now by clicking here!",
                "Hey, are we still meeting for lunch at the office today?",
                "Urgent account security alert. Update your password."
        );

        customMessages.forEach(message -> {
            String cleanMessage = BagOfWordsUtils.cleanText(message);
            List<Double> vector = new ArrayList<>();
            wordCountColumns.forEach(word -> {
                String cleanWord = word.replace("_count", "");
                vector.add((double) Arrays.stream(cleanMessage.split("\\s")).filter(w -> w.equals(cleanWord)).count());
            });
            out("Message: " + cleanMessage);
            out("Prediction: " + (naiveBayes.predict(vector) == 1 ? "Spam" : "Ham"));
        });
    }

    public static void main(String[] args) {
        SpamOrHamExample spamOrHamExample = new SpamOrHamExample();
        spamOrHamExample.defineDataframe();
        spamOrHamExample.defineDataset();
        spamOrHamExample.defineModel();
        spamOrHamExample.trainAndEvaluateModel();
        spamOrHamExample.testPredictions();
    }
}
