package io.github.dug22.tenoner.metric.impl;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.metric.Metric;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Precision implements Metric {

    private final Set<Object> targetLabels;
    private final List<Double> scores;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public Precision(Set<Object> targetLabels){
        this.targetLabels = targetLabels;
        this.scores = new ArrayList<>();
    }

    public Set<Object> getTargetLabels() {
        return targetLabels;
    }

    @Override
    public List<Double> getScores() {
        return scores;
    }

    @Override
    public <I, O> double evaluate(List<DataPoint<I, O>> dataPoints, List<O> predictions, boolean verbose) {
        AtomicInteger tp = new AtomicInteger();
        AtomicInteger fp = new AtomicInteger();
        String[] headers = new String[]{"Iteration", "Precision"};
        if (verbose) {
            System.out.printf("%-12s %-12s%n", headers[0], headers[1]);
        }
        IntStream.range(0, dataPoints.size()).forEach(i -> {
            O actual = dataPoints.get(i).output();
            O predicted = predictions.get(i);

            if(targetLabels.contains(predicted)){
                if(predicted.equals(actual))  tp.getAndIncrement(); else fp.getAndIncrement();
            }

            scores.add(Double.valueOf(decimalFormat.format(tp.get() / (double) (tp.get() + fp.get()))));

            if (verbose) {
                System.out.printf("%-12s %-12.2f%n", i, tp.get() / (double) (tp.get() + fp.get()));
            }
        });

        return tp.get() / (double) (tp.get() + fp.get());
    }
}
