package io.github.dug22.tenoner.metric;

import java.util.concurrent.atomic.AtomicReference;

public class EvaluationContext {

    private final AtomicReference<Metric> evaluationMetric = new AtomicReference<>();

    public AtomicReference<Metric> getEvaluationMetric() {
        return evaluationMetric;
    }
}
