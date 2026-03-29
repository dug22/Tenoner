package io.github.dug22.tenoner.models;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.metric.Accuracy;
import io.github.dug22.tenoner.metric.Precision;

import java.util.List;
import java.util.Map;

public interface IModel<I, O> {

    Map<String, String> summaryMap();

    void train(Dataset<I, O> dataset);

    List<O> test(Dataset<I, O> dataset);

    default void evaluateAccuracy(List<DataPoint<I, O>> dataPoints, List<O> predictions) {
        double score = new Accuracy().evaluate(dataPoints, predictions);
        recordMetric("ACCURACY", score);
    }

    default void evaluatePrecision(List<DataPoint<I, O>> dataPoints, List<O> predictions, Object targetLabel) {
        double score = new Precision(targetLabel).evaluate(dataPoints, predictions);
        recordMetric("PRECISION", score);
    }

    private void recordMetric(String name, double score) {
        summaryMap().put("Metric", name);
        summaryMap().put("Score", String.valueOf(score));
    }

    void summary();
}
