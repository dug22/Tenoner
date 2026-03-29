package io.github.dug22.tenoner.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TrainTestSplit {


    public <I, O> TrainTestSplitResult<I, O> split(Dataset<I, O> dataset, double ratio, int seed) {
        return split(dataset, ratio, true, seed);
    }

    public <I, O> TrainTestSplitResult<I, O> split(Dataset<I, O> dataset, double ratio) {
        return split(dataset, ratio, false, -1);
    }

    public <I, O> TrainTestSplitResult<I, O> split(Dataset<I, O> dataset, double ratio, boolean useSeed, int seed) {
        List<DataPoint<I, O>> dataPoints = dataset.getDataPoints();
        if (useSeed) {
            Collections.shuffle(dataPoints, new Random(seed));
        } else {
            Collections.shuffle(dataPoints);
        }
        int trainSize = (int) (dataset.getDataPoints().size() * ratio);
        Dataset<I, O> trainDataset = new Dataset<>();
        trainDataset.dataPoints = new ArrayList<>(dataPoints.subList(0, trainSize));
        Dataset<I, O> testDataset = new Dataset<>();
        testDataset.dataPoints = new ArrayList<>(dataPoints.subList(trainSize, dataPoints.size()));
        return new TrainTestSplitResult<>(trainDataset, testDataset);
    }
}
