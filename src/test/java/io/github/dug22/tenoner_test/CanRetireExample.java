package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.IntegerColumn;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.math.DataNormalizer;
import io.github.dug22.tenoner.models.impl.Perceptron;


import java.util.List;

public class CanRetireExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private Perceptron perceptron;

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        this.dataFrame = DataFrame.create();
        DoubleColumn ageColumn = DoubleColumn.create("Age");
        IntegerColumn canRetireColumn = IntegerColumn.create("Can Retire?");
        final double minAge = 18.0;
        final double maxAge = 100.0;
        for (int sampleCount = 0; sampleCount < 10000; sampleCount++) {
            double randomAge = Math.floor(Math.random() * (maxAge - minAge) + minAge);
            ageColumn.append(randomAge);
        }


        for (int i = 0; i < ageColumn.size(); i++) {
            double ageValue = ageColumn.get(i);
            if (ageValue >= 65) {
                canRetireColumn.append(1);
            } else {
                canRetireColumn.append(0);
            }
        }

        dataFrame = dataFrame.addColumns(ageColumn, canRetireColumn);
        dataFrame = Tenoner.dataNormalizer()
                .setDataFrame(dataFrame)
                .setColumns("Age")
                .setFormula(DataNormalizer.DataNormalizerFormula.MIN_MAX)
                .normalize();
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        this.dataset = Tenoner.createDoubleIntegerDataset(dataFrame)
                .inputs("Age_min_max")
                .output("Can Retire?")
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
        out("Model of Choice: Perceptron" );
        out();
        perceptron = Tenoner.perceptronDefault();
    }


    @Override
    protected void trainAndEvaluateModel() {
        out("=== Training and Evaluating Our Model ===");
        DatasetFactory.DoubleIntegerDataset fullDataset = dataset;
        DatasetFactory.DoubleIntegerDataset trainingDataset = fullDataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleIntegerDataset testingDataset = fullDataset.getTestDatasetFromSplit();
        perceptron.train(trainingDataset);
        List<Integer> predictions = perceptron.test(testingDataset);
        perceptron.evaluateAccuracy(testingDataset.getDataPoints(), predictions);
        perceptron.summary();
        out();
    }

    @Override
    protected void testPredictions() {
        out("=== Model's Predictions ===");
        DataFrame testDataFrame = DataFrame.create(DoubleColumn.create("Age", new Double[]{23D, 18D, 19D, 21D, 17D, 45d, 65d, 80d, 100d, 52d, 99d, 28d, 82d}));
        testDataFrame = Tenoner.dataNormalizer()
                                .setDataFrame(testDataFrame)
                                .setColumns("Age")
                                .setFormula(DataNormalizer.DataNormalizerFormula.MIN_MAX)
                                .normalize();
        int count = 0;
        DoubleColumn ageColumn = testDataFrame.doubleColumn("Age");
        DoubleColumn minMaxAges = testDataFrame.doubleColumn("Age_min_max");
       for(double age : minMaxAges.getValues()){
           double actualAgeValue = ageColumn.get(count);
           int prediction = perceptron.predict(List.of(age));
           String retireStatus = prediction == 1 ? "can retire!" : "cannot retire";
           System.out.println("A person that is " + actualAgeValue  + " years old " + retireStatus);
           count++;
       }
    }

    public static void main(String[] args) {
        CanRetireExample canRetireExample = new CanRetireExample();
        canRetireExample.defineDataframe();
        canRetireExample.defineDataset();
        canRetireExample.defineModel();
        canRetireExample.trainAndEvaluateModel();
        canRetireExample.testPredictions();
    }
}
