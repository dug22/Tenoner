package io.github.dug22.tenoner.data;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.io.csv.CsvReadingProperties;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dataset<I, O>  {

    protected DataFrame dataFrame;
    protected List<DataPoint<I, O>> dataPoints;
    public String[] inputColumns;
    public String outputColumn;
    private TrainTestSplitResult<I, O> trainTestSplitResult;

    public Dataset() {
        this.dataPoints = new ArrayList<>();
    }

    /**
     * Creates a dataset object from a given dataframe
     * @param dataFrame the passed dataframe instance
     * @return a dataset from a passed dataframe instance
     * @param <I> resembles inputs/features
     * @param <O> resembles outputs/labels
     */
    public static <I, O> Dataset<I, O> of(DataFrame dataFrame) {
        Dataset<I, O> dataset = new Dataset<>();
        dataset.dataFrame = dataFrame;
        return dataset;
    }

    /**
     * Creates a dataset object from a given dataset file
     * @param file the passed file instance
     * @return a dataset from a passed file instance
     * @param <I> resembles inputs/features
     * @param <O> resembles outputs/labels
     */
    public static <I, O> Dataset<I, O> of(File file) {
        Dataset<I, O> dataset = new Dataset<>();
        dataset.dataFrame = DataFrame.read().csv(file);
        return dataset;
    }

    /**
     * Creates a dataset object from a given dataset url
     * @param url the passed url instance
     * @return a dataset from a passed url instance
     * @param <I> resembles inputs/features
     * @param <O> resembles outputs/labels
     */
    public static <I, O> Dataset<I, O> of(String url) {
        Dataset<I, O> dataset = new Dataset<>();
        dataset.dataFrame = DataFrame.read().csv(url);
        return dataset;
    }

    /**
     * Initializes what columns from your dataset resembles your inputs/features
     * @param inputColumns column names
     * @return your inputs/features
     */
    public Dataset<I, O> inputs(String... inputColumns) {
        this.inputColumns = inputColumns;
        return this;
    }

    /**
     * Initializes what column from your dataset resembles your outputs/labels
     * @param outputColumn column name
     * @return your output/labels
     */
    public Dataset<I, O> output(String outputColumn) {
        this.outputColumn = outputColumn;
        return this;
    }

    /**
     * Builds the dataset object
     * @return a define Dataset
     */
    public Dataset<I, O> build() {
        if (inputColumns == null || outputColumn == null) {
            throw new IllegalArgumentException("Input & Output columns must be defined!");
        }

        if (dataFrame != null) {
            for (int i = 0; i < dataFrame.getRows().size(); i++) {
                List<I> inputs = new ArrayList<>();
                for (String column : inputColumns) {
                    I value = dataFrame.getRow(i).get(column);
                    inputs.add(value);
                }

                O output = dataFrame.getRow(i).get(outputColumn);
                DataPoint<I, O> newInstance = new DataPoint<>(inputs, output);
                dataPoints.add(newInstance);
            }
        }

        return this;
    }

    /**
     * Gets the dataset's dataframe object
     * @return the dataset's dataframe object
     */
    public DataFrame getDataFrame() {
        return dataFrame;
    }

    /**
     * Gets the dataset's data points
     * @return the dataset's datapoints
     */
    public List<DataPoint<I, O>> getDataPoints() {
        return dataPoints;
    }

    /**
     * Splits your dataset into a training and test dataset
     * @param ratio the ratio you wish to split your dataset by
     * @return a split dataset
     */
    public Dataset<I, O> split(double ratio) {
        this.trainTestSplitResult = new TrainTestSplit().split(this, ratio);
        return this;
    }

    /**
     * Splits your dataset into a training and test dataset
     * @param ratio the ratio you wish to split your dataset by
     * @param seed the random state
     * @return a split dataset
     */
    public Dataset<I, O> split(double ratio, int seed) {
        this.trainTestSplitResult = new TrainTestSplit().split(this, ratio, seed);
        return this;
    }

    /**
     * Gets your training dataset from the given split
     * @return your training dataset from the given split
     */
    public Dataset<I, O> getTrainingDatasetFromSplit() {
        if (trainTestSplitResult != null) {
            return trainTestSplitResult.trainingDataSet();
        } else {
            return null;
        }
    }

    /**
     * Gets your test dataset from the given split
     * @return your test dataset from the given split
     */
    public Dataset<I, O> getTestDatasetFromSplit() {
        if (trainTestSplitResult != null) {
            return trainTestSplitResult.testDataset();
        } else {
            return null;
        }
    }
}
