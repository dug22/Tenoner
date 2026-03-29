package io.github.dug22.tenoner.metric;

import io.github.dug22.tenoner.data.DataPoint;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Precision implements Metric {

    private Object targetLabel;

    public Precision(Object targetLabel){
        this.targetLabel = targetLabel;
    }

    public Object getTargetLabel() {
        return targetLabel;
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
            if (predicted.equals(actual)) {
                if(predicted.equals(targetLabel)) {
                    tp.getAndIncrement();
                }
            } else {
                if(predicted.equals(targetLabel)) {
                    fp.getAndIncrement();
                }
            }

            if (verbose) {
                System.out.printf("%-12s %-12.2f%n", i, tp.get() / (double) (tp.get() + fp.get()));
            }
        });

        return tp.get() / (double) (tp.get() + fp.get());
    }
}
