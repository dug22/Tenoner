package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.IntegerColumn;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.models.impl.BinomialLogisticRegression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreastCancerDiagnosisExample extends AbstractExample{

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private BinomialLogisticRegression binomialLogisticRegression;

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/breast_cancer.csv")
                .drop("id");
        IntegerColumn diagnosisID = IntegerColumn.create("diagnosis id");
        for(String diagnosis : dataFrame.stringColumn("diagnosis").getValues()){
            if(diagnosis.equalsIgnoreCase("M")){
                diagnosisID.append(0);
            }else{
                diagnosisID.append(1);
            }
        }
        dataFrame = dataFrame.addColumn(diagnosisID);
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleIntegerDataset(dataFrame)
                .inputs(
                        "radius_mean", "texture_mean", "perimeter_mean", "area_mean", "smoothness_mean",
                        "compactness_mean", "concavity_mean", "concave points_mean", "symmetry_mean", "fractal_dimension_mean",
                        "radius_se", "texture_se", "perimeter_se", "area_se", "smoothness_se",
                        "compactness_se", "concavity_se", "concave points_se", "symmetry_se", "fractal_dimension_se",
                        "radius_worst", "texture_worst", "perimeter_worst", "area_worst", "smoothness_worst",
                        "compactness_worst", "concavity_worst", "concave points_worst", "symmetry_worst", "fractal_dimension_worst"
                ).output("diagnosis id")
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
        out("Model of Choice: Binomial Logistic Regression Model");
        out();
        binomialLogisticRegression = Tenoner.binomialLogisticRegressionDefault();
    }

    @Override
    protected void trainAndEvaluateModel() {
        out("=== Training and Evaluating Our Model ===");
        DatasetFactory.DoubleIntegerDataset fullDataset = dataset;
        DatasetFactory.DoubleIntegerDataset trainingDataset = fullDataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleIntegerDataset testingDataset = fullDataset.getTestDatasetFromSplit();
        binomialLogisticRegression.train(trainingDataset);
        List<Integer> predictions = binomialLogisticRegression.test(testingDataset);
        binomialLogisticRegression.evaluateAccuracy(testingDataset.getDataPoints(), predictions);
        binomialLogisticRegression.summary();
        out();
    }

    @Override
    protected void testPredictions() {
        out("=== Model's Predictions ===");
        List<List<Double>> breastCancerProperties = new ArrayList<>();

        //Malignant
        breastCancerProperties.add(new ArrayList<>(Arrays.asList(
                16.12, 18.45, 105.30, 810.2, 0.105, 0.185, 0.160, 0.085, 0.210, 0.065,
                0.520, 0.950, 4.20, 55.0, 0.007, 0.035, 0.045, 0.018, 0.025, 0.004,
                19.50, 25.40, 130.20, 1150.0, 0.145, 0.420, 0.480, 0.190, 0.350, 0.088
        )));

        //Benign
        breastCancerProperties.add(new ArrayList<>(Arrays.asList(
                12.50, 15.20, 80.50, 480.0, 0.095, 0.075, 0.040, 0.025, 0.185, 0.062,
                0.250, 0.850, 1.80, 20.5, 0.006, 0.015, 0.020, 0.009, 0.018, 0.002,
                14.10, 20.20, 92.50, 610.0, 0.130, 0.180, 0.150, 0.080, 0.280, 0.075
        )));

        //Malignant
        breastCancerProperties.add(new ArrayList<>(Arrays.asList(
                20.29, 14.34, 135.1, 1297.0, 0.1003, 0.1328, 0.198, 0.1043, 0.1809, 0.05883,
                0.7572, 0.7813, 5.438, 94.44, 0.01149, 0.02461, 0.05688, 0.01885, 0.01756, 0.005115,
                22.54, 16.67, 152.2, 1575.0, 0.1374, 0.205, 0.4, 0.1625, 0.2364, 0.07678
        )));

        //Benign
        breastCancerProperties.add(new ArrayList<>(Arrays.asList(
                9.676, 18.33, 61.49, 285.5, 0.08123, 0.05911, 0.02329, 0.01117, 0.1593, 0.05933,
                0.2175, 1.351, 1.509, 12.65, 0.005308, 0.0195, 0.01187, 0.004738, 0.01509, 0.001619,
                10.62, 23.26, 69.1, 341.6, 0.1249, 0.1442, 0.06021, 0.02353, 0.3934, 0.07557
        )));

        for(List<Double> inputs : breastCancerProperties){
            int prediction = binomialLogisticRegression.predict(inputs);
            out("Breast Cancer Diagnosis Prediction for " + inputs + " = " + (prediction == 0 ? "M" : "B"));
        }
    }

    public static void main(String[] args) {
        BreastCancerDiagnosisExample breastCancerDiagnosisExample = new BreastCancerDiagnosisExample();
        breastCancerDiagnosisExample.defineDataframe();
        breastCancerDiagnosisExample.defineDataset();
        breastCancerDiagnosisExample.defineModel();
        breastCancerDiagnosisExample.trainAndEvaluateModel();
        breastCancerDiagnosisExample.testPredictions();
    }
}
