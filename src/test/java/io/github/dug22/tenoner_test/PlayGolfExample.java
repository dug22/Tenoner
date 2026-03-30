package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.MultinomialLogisticRegression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayGolfExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private MultinomialLogisticRegression<Double, Integer> multinomialLogisticRegression;

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/play_golf.csv");
        dataFrame.head();
        dataFrame = Tenoner.labelEncoder()
                .setDataFrame(dataFrame)
                .encodeAsDoubles(true, "Outlook", "Temperature", "Humidity", "Windy");
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleIntegerDataset(dataFrame)
                .inputs("Outlook", "Temperature", "Humidity", "Windy")
                .output("Play Golf")
                .build()
                .split(0.8, 123);
        out("=== Defining Our Dataset ===");
        out("Training Size: " + dataset.getTrainingDatasetFromSplit().getDataPoints().size());
        out("Test Size: " + dataset.getTestDatasetFromSplit().getDataPoints().size());
        out();
    }

    @Override
    protected void defineModel() {
        out("=== Defining Our Model ===");
        out("Model of Choice: Multinomial Logistic Regression");
        out();
        multinomialLogisticRegression = (MultinomialLogisticRegression<Double, Integer>) Tenoner.multinomialLogisticRegressionDefault();
    }

    @Override
    protected void trainAndEvaluateModel() {
        out("=== Training and Evaluating Our Model ===");
        DatasetFactory.DoubleIntegerDataset trainingDataset = dataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleIntegerDataset testDataset = dataset.getTestDatasetFromSplit();
        multinomialLogisticRegression.train(trainingDataset);
        List<Integer> predictions = multinomialLogisticRegression.test(testDataset);
        multinomialLogisticRegression.evaluateAccuracy(testDataset.getDataPoints(), predictions);
        multinomialLogisticRegression.summary();
        out();
    }

    @Override
    protected void testPredictions() {
        out("=== Model's Predictions ===");
        //Outlook: Rainy = 0.0 Sunny = 1.0 Overcast= 2.0
        //Temperature: Cool = 0.0  Mild = 1.0 Hot = 2.0
        //Humidity: Normal = 0.0 High = 1.0
        //Windy: false=0 true=1
        List<List<Double>> weatherConditions = new ArrayList<>();
        weatherConditions.add(Arrays.asList(0.0, 0.0, 1.0, 1.0)); //Rainy, Cool, High, Is Windy
        weatherConditions.add(Arrays.asList(1.0, 1.0, 1.0, 0.0)); //Sunny, Mild, High, Not Windy
        weatherConditions.add(Arrays.asList(1.0, 0.0, 0.0, 0.0)); //Overcast, Cool, Normal, Not Windy
        weatherConditions.add(Arrays.asList(1.0, 2.0, 1.0, 1.0)); //Sunny, Hot, High, Is Windy
        weatherConditions.add(Arrays.asList(0.0, 2.0, 1.0, 1.0)); //Overcast, Hot, High, Is Windy
        for (List<Double> inputs : weatherConditions) {
            int prediction = multinomialLogisticRegression.predict(inputs);
            System.out.println("With the given weather conditions, is it a good day to play golf? " + (prediction == 1));
        }
    }

    public static void main(String[] args) {
        PlayGolfExample playGolfExample = new PlayGolfExample();
        playGolfExample.defineDataframe();
        playGolfExample.defineDataset();
        playGolfExample.defineModel();
        playGolfExample.trainAndEvaluateModel();
        playGolfExample.testPredictions();
    }
}
