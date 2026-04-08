package io.github.dug22.tenoner.models.impl;


import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.metric.EvaluationContext;
import io.github.dug22.tenoner.models.IModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class NaiveBayes implements IModel<Double, Integer> {

    private final Map<String, String> summaryMap;
    private final Map<Integer, Double> classProbabilities;
    private final Map<Integer, Map<Integer, Double>> inputProbabilities;

    public NaiveBayes() {
        classProbabilities = new HashMap<>();
        inputProbabilities = new HashMap<>();
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
        int numberOfInputs = dataset.getDataPoints().getFirst().input().size();
        Map<Integer, Integer> classCounts = new HashMap<>();
        Map<Integer, Map<Integer, Double>> inputSums = new HashMap<>();
        dataset.getDataPoints().forEach(dataPoint -> {
            Integer output = dataPoint.output();
            classCounts.put(output, classCounts.getOrDefault(output, 0) + 1);
            inputSums.putIfAbsent(output, new HashMap<>());
            IntStream.range(0, numberOfInputs).forEach(inputIndex -> {
                double inputValue = dataPoint.input().get(inputIndex);
                inputSums.get(output).put(inputIndex, inputSums.get(output).getOrDefault(inputIndex, 0.0) + inputValue);
            });
        });

        int totalDataPoints = dataset.getDataPoints().size();
        classCounts.forEach((key, value) -> classProbabilities.put(key, (double) value / totalDataPoints));
        inputSums.forEach((key, value) -> {
            inputProbabilities.putIfAbsent(key, new HashMap<>());
            int classCount = classCounts.get(key);
            value.forEach((inputKey, inputValue) -> {
                double sum = inputValue;
                inputProbabilities.get(key).put(inputKey, sum / classCount);
            });
        });
    }

    @Override
    public List<Integer> test(Dataset<Double, Integer> dataset) {
        List<Integer> predictions = dataset.getDataPoints().stream().map(this::predict).toList();
        summaryMap().put("Test Size", String.valueOf(predictions.size()));
        return predictions;
    }

    @Override
    public void summary() {
        System.out.println("--- Naive Bayes Classification Results ---");
        System.out.printf("Total Test Samples: %s\n", summaryMap().get("Test Size"));
        System.out.printf("Model " + summaryMap().get("Metric") + " : %.2f%%\n", Double.parseDouble(summaryMap().get("Score")) * 100);
    }

    public Integer predict(List<Double> inputs) {
        return predict(new DataPoint<>(inputs, null));
    }

    private Integer predict(DataPoint<Double, Integer> dataPoint) {
        AtomicInteger bestClass = new AtomicInteger();
        final double[] maxProbability = {Double.NEGATIVE_INFINITY};
        classProbabilities.keySet().forEach(outputClass -> {
            AtomicReference<Double> classProbability = new AtomicReference<>(Math.log(classProbabilities.get(outputClass)));
            IntStream.range(0, dataPoint.input().size()).forEach(inputIndex -> {
                double inputValue = dataPoint.input().get(inputIndex);
                double inputMean = inputProbabilities.get(outputClass).getOrDefault(inputIndex, 0.0);
                double likelihood = Math.exp(-Math.pow(inputValue - inputMean, 2) / 2) / Math.sqrt(2 * Math.PI);
                classProbability.updateAndGet(v -> (v + Math.log(likelihood + 1e-6)));
            });

            if (classProbability.get() > maxProbability[0]) {
                maxProbability[0] = classProbability.get();
                bestClass.set(outputClass);
            }
        });

        return bestClass.get();
    }
}
