package io.github.dug22.tenoner.metric;

import io.github.dug22.tenoner.data.DataPoint;

import java.util.List;

public  interface Metric {

    List<Double> getScores();

   default <I, O> double evaluate(List<DataPoint<I, O>> dataPoints, List<O> predictions){
        return evaluate(dataPoints, predictions, true);
    }

   <I, O> double evaluate(List<DataPoint<I, O>> dataPoints, List<O> predictions, boolean verbose);
}
