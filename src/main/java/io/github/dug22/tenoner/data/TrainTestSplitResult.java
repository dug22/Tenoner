package io.github.dug22.tenoner.data;

import java.io.Serializable;

public record TrainTestSplitResult<I, O>(Dataset<I, O> trainingDataSet, Dataset<I, O> testDataset) implements Serializable {
}
