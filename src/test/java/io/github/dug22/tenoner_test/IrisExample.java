package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.KNNClassifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IrisExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleStringDataset dataset;
    private KNNClassifier<Double, String> knnClassifier;

    @Override
    protected void defineDataframe() {
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/iris.csv");
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleStringDataset(dataFrame)
                .inputs("SepalLength", "SepalWidth", "PetalLength", "PetalWidth")
                .output("Name")
                .build()
                .split(0.8, 42);
    }

    @Override
    protected void defineModel() {
        knnClassifier = (KNNClassifier<Double, String>) Tenoner.knnDefault();
    }

    @Override
    protected void trainAndEvaluateModel() {
        DatasetFactory.DoubleStringDataset fullDataset = dataset;
        DatasetFactory.DoubleStringDataset trainingDataset = fullDataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleStringDataset testDataset = fullDataset.getTestDatasetFromSplit();
        knnClassifier.train(trainingDataset);
        List<String> predictions = knnClassifier.test(testDataset);
        knnClassifier.evaluateAccuracy(testDataset.getDataPoints(), predictions);
        knnClassifier.summary();
    }

    @Override
    protected void testPredictions() {
        List<List<Double>> irisInputs = new ArrayList<>();
        irisInputs.add(Arrays.asList(5.3, 3.6, 1.5, 0.3)); //Iris-setosa
        irisInputs.add(Arrays.asList(6.1, 3.3, 4.3, 1.8)); //Iris-versicolor
        irisInputs.add(Arrays.asList(6.4, 3.4, 5.5, 2.3)); //Iris-virginica

        for (List<Double> inputs : irisInputs) {
            String prediction = knnClassifier.predict(inputs);
            System.out.println("Given the features " + inputs + ", the predicted Iris species is " + prediction + ".");
        }
    }

    public static void main(String[] args) {
        IrisExample irisExample = new IrisExample();
        irisExample.defineDataframe();
        irisExample.defineDataset();
        irisExample.defineModel();
        irisExample.trainAndEvaluateModel();
        irisExample.testPredictions();
    }
}
