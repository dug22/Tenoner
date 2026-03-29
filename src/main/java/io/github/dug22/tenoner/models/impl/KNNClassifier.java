package io.github.dug22.tenoner.models.impl;


import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.math.distance.DistanceFormula;
import io.github.dug22.tenoner.math.distance.EuclideanDistance;
import io.github.dug22.tenoner.math.distance.ManhattanDistance;
import io.github.dug22.tenoner.models.IModel;

import java.util.*;

public class KNNClassifier<I, O> implements IModel<I, O> {

    private final Map<String, String> summaryMap;
    private Dataset<I, O> trainingDataset;
    private final int k;
    private final DistanceFormula distanceFormula;

    public KNNClassifier(int k) {
        this.k = k;
        this.distanceFormula = DistanceFormula.EUCLIDEAN_DISTANCE;
        this.summaryMap = new HashMap<>();
    }

    public KNNClassifier(int k, DistanceFormula distanceFormula) {
        this.k = k;
        this.distanceFormula = distanceFormula;
        this.summaryMap = new HashMap<>();
    }

    @Override
    public Map<String, String> summaryMap() {
        return summaryMap;
    }

    @Override
    public void train(Dataset<I, O> trainingDataset) {
        this.trainingDataset = trainingDataset;
    }

    @Override
    public List<O> test(Dataset<I, O> dataset) {
        List<O> predictions = new ArrayList<>();
        dataset.getDataPoints().forEach(dataPoint -> predictions.add(predict(dataPoint)));
        summaryMap().put("Test Size", String.valueOf(predictions.size()));
        return predictions;
    }

    public O predict(List<I> input) {
        return predict(new DataPoint<>(input, null));
    }

    public O predict(DataPoint<I, O> testingDataPoint) {
        PriorityQueue<Neighbor<O>> nearestNeighbors = new PriorityQueue<>(Comparator.comparingDouble(n -> n.distance));
        for (DataPoint<I, O> trainingDataPoint : trainingDataset.getDataPoints()) {
            double distance;
            switch (distanceFormula) {
                case EUCLIDEAN_DISTANCE -> {
                    EuclideanDistance<I> euclideanDistance = new EuclideanDistance<>();
                    distance = euclideanDistance.apply(testingDataPoint.input(), trainingDataPoint.input());
                }

                case MANHATTAN_DISTANCE -> {
                    ManhattanDistance<I> manhattanDistance = new ManhattanDistance<>();
                    distance = manhattanDistance.apply(testingDataPoint.input(), trainingDataPoint.input());
                }

                default -> throw new RuntimeException("That distance formula does not exist!");
            }

            nearestNeighbors.add(new Neighbor<>(trainingDataPoint.output(), distance));
        }

        Map<O, Integer> outputCounts = new HashMap<>();
        for (int i = 0; i < k && !nearestNeighbors.isEmpty(); i++) {
            O output = nearestNeighbors.poll().output;
            outputCounts.put(output, outputCounts.getOrDefault(output, 0) + 1);
        }

        Map.Entry<O, Integer> maxEntry = null;
        for (Map.Entry<O, Integer> entry : outputCounts.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;

            }
        }

        return maxEntry.getKey();
    }

    public void summary() {
        System.out.println("--- KNN Classification Results ---");
        System.out.printf("Total Test Samples: %s\n", summaryMap().get("Test Size"));
        System.out.printf("Model " + summaryMap().get("Metric") + " : %.2f%%\n", Double.parseDouble(summaryMap().get("Score")) * 100);
    }

    private double calculateEuclideanDistance(List<I> inputA, List<I> inputB) {
        double sum = 0.0;
        int index = 0;
        while (index < inputA.size()) {
            double valueA = ((Number) inputA.get(index)).doubleValue();
            double valueB = ((Number) inputB.get(index)).doubleValue();
            sum += Math.pow(valueA - valueB, 2);
            index++;
        }

        return Math.sqrt(sum);
    }

    private record Neighbor<O>(O output, double distance) {
    }

    public static class Builder {

        private int k = 3;
        private DistanceFormula formula = DistanceFormula.EUCLIDEAN_DISTANCE;

        public Builder k(int k) {
            this.k = k;
            return this;
        }

        public Builder formula(DistanceFormula formula) {
            this.formula = formula;
            return this;
        }

        public KNNClassifier<?, ?> build() {
            return new KNNClassifier<>(k, formula);
        }
    }
}