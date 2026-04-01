package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.StringColumn;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.NaiveBayes;
import io.github.dug22.tenoner_test.utils.BagOfWordsUtils;

import java.util.*;
import java.util.function.Predicate;

public class SentimentAnalysisExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private NaiveBayes naiveBayes;
    private final List<String> wordCountColumns = new ArrayList<>();

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/synthetic_reviews.csv");
        dataFrame = Tenoner.labelEncoder()
                .setDataFrame(dataFrame)
                .encodeAsIntegersWithCustomOrder(Map.of(
                        "sentiment", new String[]{"negative", "positive", "neutral"}
                ));
        StringColumn reviewTextColumn = dataFrame.stringColumn("review_text").apply(BagOfWordsUtils::cleanText);
        dataFrame = dataFrame.replaceColumn(dataFrame.getColumnIndex(reviewTextColumn.name()), reviewTextColumn);
        Set<String> vocab = BagOfWordsUtils.buildVocab(reviewTextColumn.getValues());
        BagOfWordsUtils.createVectorColumns(dataFrame, reviewTextColumn, vocab);
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleIntegerDataset(dataFrame);
        for (String column : dataFrame.columnNames()) {
            if (column.contains("_count")) {
                wordCountColumns.add(column);
            }
        }
        String[] finalWordCountColumns = wordCountColumns.toArray(new String[0]);
        dataset = dataset.inputs(finalWordCountColumns)
                .output("sentiment")
                .build()
                .split(0.8, 42);
        out("=== Defining Our Dataset ===");
        out("Training Size: " + dataset.getTrainingDatasetFromSplit().getDataPoints().size());
        out("Test Size: " + dataset.getTestDatasetFromSplit().getDataPoints().size());
        out();
    }

    @Override
    protected void defineModel() {
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
        List<String> reviews = Arrays.asList(
                "I really hate this laptop. I want a refund!",
                "This phone is really amazing and I really love it!",
                "The car that I bought is okay, but the design is a little poor."
        );

        reviews.forEach(review -> {
            String cleanMessage = BagOfWordsUtils.cleanText(review);
            List<Double> vector = new ArrayList<>();
            wordCountColumns.forEach(word -> {
                String cleanedWord = word.replace("_count", "");
                vector.add((double) Arrays.stream(cleanMessage.split("\\s")).filter(w -> w.equals(cleanedWord)).count());
            });
            out("Message: " + cleanMessage);
            int prediction = naiveBayes.predict(vector);
            switch (prediction) {
                case 0 -> out("Sentiment of this review is NEGATIVE");
                case 1 -> out("Sentiment of this review is POSITIVE");
                case 2 -> out("Sentiment of this review is NEUTRAL");
            }
        });
    }

    public static void main(String[] args) {
        SentimentAnalysisExample sentimentAnalysisExample = new SentimentAnalysisExample();
        sentimentAnalysisExample.defineDataframe();
        sentimentAnalysisExample.defineDataset();
        sentimentAnalysisExample.defineModel();
        sentimentAnalysisExample.trainAndEvaluateModel();
        sentimentAnalysisExample.testPredictions();
    }
}
