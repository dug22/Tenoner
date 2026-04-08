package io.github.dug22.tenoner.models.impl;


import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.metric.EvaluationContext;
import io.github.dug22.tenoner.models.IModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinomialLogisticRegression implements IModel<Double, Integer> {

    private final Map<String, String> summaryMap;
    private double[] weights;
    private int epochs;
    private double learningRate;
    private double bias;
    private final double threshold;

    public BinomialLogisticRegression() {
        this.epochs = 1000;
        this.learningRate = 0.01;
        this.threshold = 0.5;
        this.bias = 0.0;
        this.summaryMap = new HashMap<>();
    }

    public BinomialLogisticRegression(int epochs) {
        this.epochs = epochs;
        this.learningRate = 0.01;
        this.threshold = 0.5;
        this.bias = 0.0;
        this.summaryMap = new HashMap<>();
    }

    public BinomialLogisticRegression(int epochs, double learningRate) {
        this.epochs = epochs;
        this.learningRate = learningRate;
        this.threshold = 0.5;
        this.bias = 0.0;
        this.summaryMap = new HashMap<>();
    }

    public BinomialLogisticRegression(int epochs, double learningRate, double threshold) {
        this.epochs = epochs;
        this.learningRate = learningRate;
        this.bias = 0.0;
        this.threshold = threshold;
        this.summaryMap = new HashMap<>();
    }

    @Override
    public EvaluationContext getEvaluationContext() {
        return new EvaluationContext();
    }

    @Override
    public Map<String, String> summaryMap() {
        return summaryMap;
    }

    @Override
    public void train(Dataset<Double, Integer> dataset) {
        List<DataPoint<Double, Integer>> dataPoints = dataset.getDataPoints();
        int numberOfInputs = dataPoints.getFirst().input().size();
        weights = new double[numberOfInputs];
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (DataPoint<Double, Integer> dataPoint : dataPoints) {
                List<Double> input = dataPoint.input();
                int output = dataPoint.output();
                double rawPrediction = predictRaw(input);
                double prediction = sigmoid(rawPrediction);
                for (int i = 0; i < weights.length; i++) {
                    weights[i] -= learningRate * (prediction - output) * input.get(i);
                }
                bias -= learningRate * (prediction - output);
            }
        }
    }

    @Override
    public List<Integer> test(Dataset<Double, Integer> dataset) {
        List<Integer> predictions = dataset.getDataPoints().stream().map(dataPoint -> predict(dataPoint.input())).toList();
        summaryMap().put("Test Size", String.valueOf(predictions.size()));
        return predictions;
    }

    private double predictRaw(List<Double> inputs) {
        double sum = bias;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i] * inputs.get(i);
        }
        return sum;
    }

    public int predict(List<Double> inputs) {
        return sigmoid(predictRaw(inputs)) >= threshold ? 1 : 0;
    }

    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    @Override
    public void summary() {
        System.out.println("--- Binomial Logistic Regression Results ---");
        System.out.printf("Total Test Samples: %s\n", summaryMap().get("Test Size"));
        System.out.printf("Model " + summaryMap().get("Metric") + " : %.2f%%\n", Double.parseDouble(summaryMap().get("Score")) * 100);
    }

    public Map<String, String> getSummaryMap() {
        return summaryMap;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public int getEpochs() {
        return epochs;
    }

    public void setEpochs(int epochs) {
        this.epochs = epochs;
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double getThreshold() {
        return threshold;
    }

    public static class Builder {

        private int epochs = 1000;
        private double learningRate = 0.01;
        private double threshold = 0.5;

        public Builder epochs(int epochs) {
            this.epochs = epochs;
            return this;
        }

        public Builder learningRate(double learningRate) {
            this.learningRate = learningRate;
            return this;
        }

        public Builder threshold(double threshold) {
            this.threshold = threshold;
            return this;
        }

        public BinomialLogisticRegression build() {
            return new BinomialLogisticRegression(epochs, learningRate, threshold);
        }
    }
}
