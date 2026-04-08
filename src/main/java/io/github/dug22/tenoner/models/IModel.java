package io.github.dug22.tenoner.models;

import io.github.dug22.tenoner.data.DataPoint;
import io.github.dug22.tenoner.data.Dataset;
import io.github.dug22.tenoner.metric.impl.Accuracy;
import io.github.dug22.tenoner.metric.EvaluationContext;
import io.github.dug22.tenoner.metric.impl.Precision;
import io.github.dug22.tenoner.metric.impl.Recall;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IModel<I, O> {

    EvaluationContext getEvaluationContext();

    Map<String, String> summaryMap();

    void train(Dataset<I, O> dataset);

    List<O> test(Dataset<I, O> dataset);

    default void evaluateAccuracy(List<DataPoint<I, O>> dataPoints, List<O> predictions) {
        Accuracy accuracy = new Accuracy();
        double score = accuracy.evaluate(dataPoints, predictions);
        getEvaluationContext().getEvaluationMetric().set(accuracy);
        recordMetric("ACCURACY", score);
    }

    default void evaluatePrecision(List<DataPoint<I, O>> dataPoints, List<O> predictions, Set<Object> targetLabels) {
        Precision precision = new Precision(targetLabels);
        double score = precision.evaluate(dataPoints, predictions);
        getEvaluationContext().getEvaluationMetric().set(precision);
        recordMetric("PRECISION", score);
    }

    default void evaluateRecall(List<DataPoint<I, O>> dataPoints, List<O> predictions, Set<Object> targetLabels) {
        Recall recall = new Recall(targetLabels);
        double score = recall.evaluate(dataPoints, predictions);
        getEvaluationContext().getEvaluationMetric().set(recall);
        recordMetric("RECALL", score);
    }

    private void recordMetric(String name, double score) {
        summaryMap().put("Metric", name);
        summaryMap().put("Score", String.valueOf(score));
    }

    void summary();

    default List<Double> getScores() {
        return getEvaluationContext().getEvaluationMetric().get().getScores();
    }
}
