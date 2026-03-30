package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.StringColumn;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.NaiveBayes;

import java.util.*;
import java.util.function.Predicate;

public class SpamOrHamExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private NaiveBayes naiveBayes;
    private HashMap<String, Double> vocabulary = new HashMap<>();
    private List<String> countColumns = new ArrayList<>();

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/spam_or_ham.csv");
        StringColumn textColumn = dataFrame.stringColumn("text");
        textColumn = textColumn.apply(this::cleanText);
        dataFrame.replaceColumn(dataFrame.getColumnIndex("text"), textColumn);
        Set<String> vocab = new HashSet<>();
        for (String rowText : textColumn) {
            vocab.addAll(Arrays.asList(rowText.split("\\s+")));
        }
        int rowCount = dataFrame.getRowCount();
        for (String word : vocab) {
            if (word.isEmpty()) continue;

            Double[] counts = new Double[rowCount];
            for (int i = 0; i < rowCount; i++) {
                String rowText = textColumn.get(i);
                String[] wordsInRow = rowText.split("\\s+");
                long count = Arrays.stream(wordsInRow).filter(w -> w.equals(word)).count();
                counts[i] = (double) count;
            }

            dataFrame.addColumn(DoubleColumn.create(word + "_count", counts));
        }

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
                countColumns.add(column);
            }
        }
        String[] finalCountColumns = countColumns.toArray(new String[0]);
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
            String cleanMessage = cleanText(message);
            List<Double> vector = new ArrayList<>();
            countColumns.forEach(countColumn -> {
                String word = countColumn.replace("_count", "");
                Predicate<String> wordEqualsFilter = s -> s.equals(word);
                vector.add((double) Arrays.stream(cleanMessage.split("\\s")).filter(wordEqualsFilter).count());
            });
            out("Message: " + cleanMessage);
            out("Prediction: " + (naiveBayes.predict(vector) == 1 ? "Spam" : "Ham"));
        });
    }

    private String cleanText(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("\\p{Punct}", "");

        return text;
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
