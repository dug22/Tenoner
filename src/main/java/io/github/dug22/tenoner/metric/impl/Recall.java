package io.github.dug22.tenoner.metric.impl;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.metric.Metric;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Recall implements Metric {

    private final Set<Object> targetLabels;
    private List<Double> scores;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Recall(Set<Object> targetLabels){
        this.targetLabels = targetLabels;
        this.scores = new ArrayList<>();
    }

    public Set<Object> getTargetLabels() {
        return targetLabels;
    }

    @Override
    public <I, O> double evaluate(List<DataPoint<I, O>> dataPoints, List<O> predictions, boolean verbose) {
        AtomicInteger tp = new AtomicInteger();
        AtomicInteger fn = new AtomicInteger();
        String[] headers = new String[]{"Iteration", "Recall"};
        if (verbose) {
            System.out.printf("%-12s %-12s%n", headers[0], headers[1]);
        }
        IntStream.range(0, dataPoints.size()).forEach(i -> {
            O actual = dataPoints.get(i).output();
            O predicted = predictions.get(i);

            if(targetLabels.contains(actual)){
                if(actual.equals(predicted))  tp.getAndIncrement(); else fn.getAndIncrement();
            }

            if (verbose) {
                System.out.printf("%-12s %-12.2f%n", i, tp.get() / (double) (tp.get() + fn.get()));
            }

            scores.add(Double.valueOf(decimalFormat.format(tp.get() / (double) (tp.get() + fn.get()))));
        });

        return tp.get() / (double) (tp.get() + fn.get());
    }

    @Override
    public List<Double> getScores() {
        return scores;
    }
}