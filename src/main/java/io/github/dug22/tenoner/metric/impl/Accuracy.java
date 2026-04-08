package io.github.dug22.tenoner.metric.impl;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.metric.Metric;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Accuracy implements Metric {

    private final List<Double> scores;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Accuracy(){
        this.scores = new ArrayList<>();
    }

    public <I, O> double evaluate(List<DataPoint<I, O>> dataPoints, List<O> predictions, boolean verbose) {
        int count = 0;
        int maxSize = dataPoints.size();
        int correct = 0;
        String[] headers = new String[]{"Iteration", "Accuracy"};
        if (verbose) {
            System.out.printf("%-12s %-12s%n", headers[0], headers[1]);
        }
        while (count < maxSize) {
            O output = dataPoints.get(count).output();
            O prediction = predictions.get(count);
            if (output.equals(prediction)) {
                correct++;
            }

            if (verbose) {
                System.out.printf("%-12s %-12.2f%n", count, (double)correct / maxSize);
            }

            scores.add(Double.valueOf(decimalFormat.format((double) correct / maxSize)));

            count++;
        }

        return (double) correct / maxSize;
    }

    @Override
    public List<Double> getScores() {
        return scores;
    }
}
