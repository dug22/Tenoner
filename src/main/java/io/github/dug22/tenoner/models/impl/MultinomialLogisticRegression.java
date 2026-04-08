package io.github.dug22.tenoner.models.impl;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.metric.EvaluationContext;
import io.github.dug22.tenoner.models.IModel;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultinomialLogisticRegression<I, O> implements IModel<I, O> {

    private final Map<String, String> summaryMap;
    private double[][] weights;
    private int epochs;
    private double learningRate;
    private double[] biases;
    private int numberOfClasses;
    private List<O> outputEnumeration;
    private final EvaluationContext evaluationContext = new EvaluationContext();

    public MultinomialLogisticRegression() {
        this.epochs = 1000;
        this.learningRate = 0.01;
        this.summaryMap = new HashMap<>();
        this.outputEnumeration = new ArrayList<>();
    }

    public MultinomialLogisticRegression(int epochs) {
        this.epochs = epochs;
        this.learningRate = 0.01;
        this.summaryMap = new HashMap<>();
        this.outputEnumeration = new ArrayList<>();
    }

    public MultinomialLogisticRegression(int epochs, double learningRate) {
        this.epochs = epochs;
        this.learningRate = learningRate;
        this.summaryMap = new HashMap<>();
        this.outputEnumeration = new ArrayList<>();
    }

    public MultinomialLogisticRegression(int epochs, double learningRate, double threshold) {
        this.epochs = epochs;
        this.learningRate = learningRate;
        this.summaryMap = new HashMap<>();
        this.outputEnumeration = new ArrayList<>();
    }

    @Override
    public EvaluationContext getEvaluationContext() {
        return evaluationContext;
    }

    @Override
    public Map<String, String> summaryMap() {
        return summaryMap;
    }

    @Override
    public void train(Dataset<I, O> dataset) {
        List<DataPoint<I, O>> dataPoints = dataset.getDataPoints();
        int numberOfInputs = dataPoints.getFirst().input().size();
        this.outputEnumeration = dataPoints.stream()
                .map(DataPoint::output)
                .distinct()
                .collect(Collectors.toList());
        this.numberOfClasses = outputEnumeration.size();
        this.weights = new double[numberOfClasses][numberOfInputs];
        this.biases = new double[numberOfClasses];
        IntStream.range(0, epochs).forEach(_ -> dataPoints.forEach(dataPoint -> {
            List<I> inputs = dataPoint.input();
            int actualLabelIndex = outputEnumeration.indexOf(dataPoint.output());

            double[] probabilities = calculateProbabilities(inputs);

            for (int k = 0; k < numberOfClasses; k++) {
                double target = (k == actualLabelIndex) ? 1.0 : 0.0;
                double error = probabilities[k] - target;

                for (int i = 0; i < numberOfInputs; i++) {
                    weights[k][i] -= learningRate * error * ((Number) inputs.get(i)).doubleValue();
                }
                biases[k] -= learningRate * error;
            }
        }));
    }


    @Override
    public List<O> test(Dataset<I, O> dataset) {
        List<O> predictions = dataset.getDataPoints().stream()
                .map(datapoint -> predict(datapoint.input()))
                .toList();
        summaryMap().put("Test Size", String.valueOf(predictions.size()));
        return predictions;
    }

    @Override
    public void summary() {
        System.out.println("--- Multinomial Logistic Regression Results ---");
        System.out.printf("Total Test Samples: %s\n", summaryMap().get("Test Size"));
        System.out.printf("Model " + summaryMap().get("Metric") + " : %.2f%%\n", Double.parseDouble(summaryMap().get("Score")) * 100);
    }

    public O predict(List<I> inputs) {
        double[] probabilities = calculateProbabilities(inputs);
        int bestClassIndex = pickBestClass(probabilities);
        return outputEnumeration.get(bestClassIndex);
    }

    private double[] calculateProbabilities(List<I> features) {
        int numClasses = outputEnumeration.size();
        double[] scores = new double[numClasses];

        for (int i = 0; i < numClasses; i++) {
            double sum = biases[i];
            for (int j = 0; j < weights[i].length; j++) {
                sum += weights[i][j] * ((Number) features.get(j)).doubleValue();
            }
            scores[i] = sum;
        }
        return softmax(scores);
    }

    private double[] softmax(double[] score) {
        double maxScore = Arrays.stream(score).max().orElse(0.0);
        double sum = 0.0;
        int scoreLength = score.length;
        double[] result = new double[scoreLength];
        for (int i = 0; i < scoreLength; i++) {
            result[i] = Math.exp(score[i] - maxScore);
            sum += result[i];
        }
        for (int i = 0; i < scoreLength; i++) {
            result[i] /= sum;
        }
        return result;
    }

    private int pickBestClass(double[] array) {
        AtomicInteger maxIndex = new AtomicInteger();
        IntStream.range(1, array.length)
                .forEach(i -> {
                    if (array[i] > array[maxIndex.get()]) {
                        maxIndex.set(i);
                    }
                });
        return maxIndex.get();
    }

    public Map<String, String> getSummaryMap() {
        return summaryMap;
    }

    public double[][] getWeights() {
        return weights;
    }

    public void setWeights(double[][] weights) {
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

    public double[] getBiases() {
        return biases;
    }

    public void setBiases(double[] biases) {
        this.biases = biases;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public List<O> getOutputEnumeration() {
        return outputEnumeration;
    }

    public void setOutputEnumeration(List<O> outputEnumeration) {
        this.outputEnumeration = outputEnumeration;
    }

    public static class Builder {

        private int epochs = 1000;
        private double learningRate = 0.01;

        public MultinomialLogisticRegression.Builder epochs(int epochs) {
            this.epochs = epochs;
            return this;
        }

        public MultinomialLogisticRegression.Builder learningRate(double learningRate) {
            this.learningRate = learningRate;
            return this;
        }

        public MultinomialLogisticRegression<?, ?> build() {
            return new MultinomialLogisticRegression<>(epochs, learningRate);
        }
    }
}
