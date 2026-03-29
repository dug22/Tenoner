package io.github.dug22.tenoner.data;

import io.github.dug22.carpentry.DataFrame;

import java.io.File;

/**
 * This class allows you to define varieties of Dataset Objects
 * without having to pass generics for Inputs/Outputs upon
 * initialization.
 */
public class DatasetFactory {

    // --- Boolean ---
    public static class BooleanBooleanDataset extends Dataset<Boolean, Boolean> {
        public BooleanBooleanDataset() {
        }


        public BooleanBooleanDataset(Dataset<Boolean, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanBooleanDataset of(DataFrame df) {
            BooleanBooleanDataset ds = new BooleanBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanBooleanDataset getTrainingDatasetFromSplit() {
            return new BooleanBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanBooleanDataset getTestDatasetFromSplit() {
            return new BooleanBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanByteDataset extends Dataset<Boolean, Byte> {
        public BooleanByteDataset() {
        }

        public BooleanByteDataset(Dataset<Boolean, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanByteDataset of(DataFrame df) {
            BooleanByteDataset ds = new BooleanByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanByteDataset getTrainingDatasetFromSplit() {
            return new BooleanByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanByteDataset getTestDatasetFromSplit() {
            return new BooleanByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanCharacterDataset extends Dataset<Boolean, Character> {
        public BooleanCharacterDataset() {
        }

        public BooleanCharacterDataset(Dataset<Boolean, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanCharacterDataset of(DataFrame df) {
            BooleanCharacterDataset ds = new BooleanCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanCharacterDataset getTrainingDatasetFromSplit() {
            return new BooleanCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanCharacterDataset getTestDatasetFromSplit() {
            return new BooleanCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanDoubleDataset extends Dataset<Boolean, Double> {
        public BooleanDoubleDataset() {
        }

        public BooleanDoubleDataset(Dataset<Boolean, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanDoubleDataset of(DataFrame df) {
            BooleanDoubleDataset ds = new BooleanDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanDoubleDataset getTrainingDatasetFromSplit() {
            return new BooleanDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanDoubleDataset getTestDatasetFromSplit() {
            return new BooleanDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanFloatDataset extends Dataset<Boolean, Float> {
        public BooleanFloatDataset() {
        }

        public BooleanFloatDataset(Dataset<Boolean, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanFloatDataset of(DataFrame df) {
            BooleanFloatDataset ds = new BooleanFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanFloatDataset getTrainingDatasetFromSplit() {
            return new BooleanFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanFloatDataset getTestDatasetFromSplit() {
            return new BooleanFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanIntegerDataset extends Dataset<Boolean, Integer> {
        public BooleanIntegerDataset() {
        }

        public BooleanIntegerDataset(Dataset<Boolean, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanIntegerDataset of(DataFrame df) {
            BooleanIntegerDataset ds = new BooleanIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanIntegerDataset getTrainingDatasetFromSplit() {
            return new BooleanIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanIntegerDataset getTestDatasetFromSplit() {
            return new BooleanIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanLongDataset extends Dataset<Boolean, Long> {
        public BooleanLongDataset() {
        }

        public BooleanLongDataset(Dataset<Boolean, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanLongDataset of(DataFrame df) {
            BooleanLongDataset ds = new BooleanLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanLongDataset getTrainingDatasetFromSplit() {
            return new BooleanLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanLongDataset getTestDatasetFromSplit() {
            return new BooleanLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanShortDataset extends Dataset<Boolean, Short> {
        public BooleanShortDataset() {
        }

        public BooleanShortDataset(Dataset<Boolean, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanShortDataset of(DataFrame df) {
            BooleanShortDataset ds = new BooleanShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanShortDataset getTrainingDatasetFromSplit() {
            return new BooleanShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanShortDataset getTestDatasetFromSplit() {
            return new BooleanShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class BooleanStringDataset extends Dataset<Boolean, String> {
        public BooleanStringDataset() {
        }

        public BooleanStringDataset(Dataset<Boolean, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static BooleanStringDataset of(DataFrame df) {
            BooleanStringDataset ds = new BooleanStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static BooleanStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static BooleanStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public BooleanStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public BooleanStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public BooleanStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public BooleanStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public BooleanStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public BooleanStringDataset getTrainingDatasetFromSplit() {
            return new BooleanStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public BooleanStringDataset getTestDatasetFromSplit() {
            return new BooleanStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Byte ---
    public static class ByteBooleanDataset extends Dataset<Byte, Boolean> {
        public ByteBooleanDataset() {
        }

        public ByteBooleanDataset(Dataset<Byte, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteBooleanDataset of(DataFrame df) {
            ByteBooleanDataset ds = new ByteBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteBooleanDataset getTrainingDatasetFromSplit() {
            return new ByteBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteBooleanDataset getTestDatasetFromSplit() {
            return new ByteBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteByteDataset extends Dataset<Byte, Byte> {
        public ByteByteDataset() {
        }

        public ByteByteDataset(Dataset<Byte, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteByteDataset of(DataFrame df) {
            ByteByteDataset ds = new ByteByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteByteDataset getTrainingDatasetFromSplit() {
            return new ByteByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteByteDataset getTestDatasetFromSplit() {
            return new ByteByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteCharacterDataset extends Dataset<Byte, Character> {
        public ByteCharacterDataset() {
        }

        public ByteCharacterDataset(Dataset<Byte, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteCharacterDataset of(DataFrame df) {
            ByteCharacterDataset ds = new ByteCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteCharacterDataset getTrainingDatasetFromSplit() {
            return new ByteCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteCharacterDataset getTestDatasetFromSplit() {
            return new ByteCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteDoubleDataset extends Dataset<Byte, Double> {
        public ByteDoubleDataset() {
        }

        public ByteDoubleDataset(Dataset<Byte, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteDoubleDataset of(DataFrame df) {
            ByteDoubleDataset ds = new ByteDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteDoubleDataset getTrainingDatasetFromSplit() {
            return new ByteDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteDoubleDataset getTestDatasetFromSplit() {
            return new ByteDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteFloatDataset extends Dataset<Byte, Float> {
        public ByteFloatDataset() {
        }

        public ByteFloatDataset(Dataset<Byte, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteFloatDataset of(DataFrame df) {
            ByteFloatDataset ds = new ByteFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteFloatDataset getTrainingDatasetFromSplit() {
            return new ByteFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteFloatDataset getTestDatasetFromSplit() {
            return new ByteFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteIntegerDataset extends Dataset<Byte, Integer> {
        public ByteIntegerDataset() {
        }

        public ByteIntegerDataset(Dataset<Byte, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteIntegerDataset of(DataFrame df) {
            ByteIntegerDataset ds = new ByteIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteIntegerDataset getTrainingDatasetFromSplit() {
            return new ByteIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteIntegerDataset getTestDatasetFromSplit() {
            return new ByteIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteLongDataset extends Dataset<Byte, Long> {
        public ByteLongDataset() {
        }

        public ByteLongDataset(Dataset<Byte, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteLongDataset of(DataFrame df) {
            ByteLongDataset ds = new ByteLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteLongDataset getTrainingDatasetFromSplit() {
            return new ByteLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteLongDataset getTestDatasetFromSplit() {
            return new ByteLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteShortDataset extends Dataset<Byte, Short> {
        public ByteShortDataset() {
        }

        public ByteShortDataset(Dataset<Byte, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteShortDataset of(DataFrame df) {
            ByteShortDataset ds = new ByteShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteShortDataset getTrainingDatasetFromSplit() {
            return new ByteShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteShortDataset getTestDatasetFromSplit() {
            return new ByteShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ByteStringDataset extends Dataset<Byte, String> {
        public ByteStringDataset() {
        }

        public ByteStringDataset(Dataset<Byte, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ByteStringDataset of(DataFrame df) {
            ByteStringDataset ds = new ByteStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ByteStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ByteStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ByteStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ByteStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ByteStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public ByteStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ByteStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ByteStringDataset getTrainingDatasetFromSplit() {
            return new ByteStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ByteStringDataset getTestDatasetFromSplit() {
            return new ByteStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Character ---
    public static class CharacterBooleanDataset extends Dataset<Character, Boolean> {
        public CharacterBooleanDataset() {
        }

        public CharacterBooleanDataset(Dataset<Character, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterBooleanDataset of(DataFrame df) {
            CharacterBooleanDataset ds = new CharacterBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterBooleanDataset getTrainingDatasetFromSplit() {
            return new CharacterBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterBooleanDataset getTestDatasetFromSplit() {
            return new CharacterBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterByteDataset extends Dataset<Character, Byte> {
        public CharacterByteDataset() {
        }

        public CharacterByteDataset(Dataset<Character, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterByteDataset of(DataFrame df) {
            CharacterByteDataset ds = new CharacterByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterByteDataset getTrainingDatasetFromSplit() {
            return new CharacterByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterByteDataset getTestDatasetFromSplit() {
            return new CharacterByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterCharacterDataset extends Dataset<Character, Character> {
        public CharacterCharacterDataset() {
        }

        public CharacterCharacterDataset(Dataset<Character, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterCharacterDataset of(DataFrame df) {
            CharacterCharacterDataset ds = new CharacterCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterCharacterDataset getTrainingDatasetFromSplit() {
            return new CharacterCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterCharacterDataset getTestDatasetFromSplit() {
            return new CharacterCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterDoubleDataset extends Dataset<Character, Double> {
        public CharacterDoubleDataset() {
        }

        public CharacterDoubleDataset(Dataset<Character, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterDoubleDataset of(DataFrame df) {
            CharacterDoubleDataset ds = new CharacterDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterDoubleDataset getTrainingDatasetFromSplit() {
            return new CharacterDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterDoubleDataset getTestDatasetFromSplit() {
            return new CharacterDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterFloatDataset extends Dataset<Character, Float> {
        public CharacterFloatDataset() {
        }

        public CharacterFloatDataset(Dataset<Character, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterFloatDataset of(DataFrame df) {
            CharacterFloatDataset ds = new CharacterFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterFloatDataset getTrainingDatasetFromSplit() {
            return new CharacterFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterFloatDataset getTestDatasetFromSplit() {
            return new CharacterFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterIntegerDataset extends Dataset<Character, Integer> {
        public CharacterIntegerDataset() {
        }

        public CharacterIntegerDataset(Dataset<Character, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterIntegerDataset of(DataFrame df) {
            CharacterIntegerDataset ds = new CharacterIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterIntegerDataset getTrainingDatasetFromSplit() {
            return new CharacterIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterIntegerDataset getTestDatasetFromSplit() {
            return new CharacterIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterLongDataset extends Dataset<Character, Long> {
        public CharacterLongDataset() {
        }

        public CharacterLongDataset(Dataset<Character, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterLongDataset of(DataFrame df) {
            CharacterLongDataset ds = new CharacterLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterLongDataset getTrainingDatasetFromSplit() {
            return new CharacterLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterLongDataset getTestDatasetFromSplit() {
            return new CharacterLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterShortDataset extends Dataset<Character, Short> {
        public CharacterShortDataset() {
        }

        public CharacterShortDataset(Dataset<Character, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterShortDataset of(DataFrame df) {
            CharacterShortDataset ds = new CharacterShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterShortDataset getTrainingDatasetFromSplit() {
            return new CharacterShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterShortDataset getTestDatasetFromSplit() {
            return new CharacterShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class CharacterStringDataset extends Dataset<Character, String> {
        public CharacterStringDataset() {
        }

        public CharacterStringDataset(Dataset<Character, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static CharacterStringDataset of(DataFrame df) {
            CharacterStringDataset ds = new CharacterStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static CharacterStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static CharacterStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public CharacterStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public CharacterStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public CharacterStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public CharacterStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public CharacterStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public CharacterStringDataset getTrainingDatasetFromSplit() {
            return new CharacterStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public CharacterStringDataset getTestDatasetFromSplit() {
            return new CharacterStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Double ---
    public static class DoubleBooleanDataset extends Dataset<Double, Boolean> {
        public DoubleBooleanDataset() {
        }

        public DoubleBooleanDataset(Dataset<Double, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleBooleanDataset of(DataFrame df) {
            DoubleBooleanDataset ds = new DoubleBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleBooleanDataset getTrainingDatasetFromSplit() {
            return new DoubleBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleBooleanDataset getTestDatasetFromSplit() {
            return new DoubleBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleByteDataset extends Dataset<Double, Byte> {
        public DoubleByteDataset() {
        }

        public DoubleByteDataset(Dataset<Double, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleByteDataset of(DataFrame df) {
            DoubleByteDataset ds = new DoubleByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleByteDataset getTrainingDatasetFromSplit() {
            return new DoubleByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleByteDataset getTestDatasetFromSplit() {
            return new DoubleByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleCharacterDataset extends Dataset<Double, Character> {
        public DoubleCharacterDataset() {
        }

        public DoubleCharacterDataset(Dataset<Double, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleCharacterDataset of(DataFrame df) {
            DoubleCharacterDataset ds = new DoubleCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleCharacterDataset getTrainingDatasetFromSplit() {
            return new DoubleCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleCharacterDataset getTestDatasetFromSplit() {
            return new DoubleCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleDoubleDataset extends Dataset<Double, Double> {
        public DoubleDoubleDataset() {
        }

        public DoubleDoubleDataset(Dataset<Double, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleDoubleDataset of(DataFrame df) {
            DoubleDoubleDataset ds = new DoubleDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleDoubleDataset getTrainingDatasetFromSplit() {
            return new DoubleDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleDoubleDataset getTestDatasetFromSplit() {
            return new DoubleDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleFloatDataset extends Dataset<Double, Float> {
        public DoubleFloatDataset() {
        }

        public DoubleFloatDataset(Dataset<Double, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleFloatDataset of(DataFrame df) {
            DoubleFloatDataset ds = new DoubleFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleFloatDataset getTrainingDatasetFromSplit() {
            return new DoubleFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleFloatDataset getTestDatasetFromSplit() {
            return new DoubleFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleIntegerDataset extends Dataset<Double, Integer> {
        public DoubleIntegerDataset() {
        }

        public DoubleIntegerDataset(Dataset<Double, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleIntegerDataset of(DataFrame df) {
            DoubleIntegerDataset ds = new DoubleIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleIntegerDataset getTrainingDatasetFromSplit() {
            return new DoubleIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleIntegerDataset getTestDatasetFromSplit() {
            return new DoubleIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleLongDataset extends Dataset<Double, Long> {
        public DoubleLongDataset() {
        }

        public DoubleLongDataset(Dataset<Double, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleLongDataset of(DataFrame df) {
            DoubleLongDataset ds = new DoubleLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleLongDataset getTrainingDatasetFromSplit() {
            return new DoubleLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleLongDataset getTestDatasetFromSplit() {
            return new DoubleLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleShortDataset extends Dataset<Double, Short> {
        public DoubleShortDataset() {
        }

        public DoubleShortDataset(Dataset<Double, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleShortDataset of(DataFrame df) {
            DoubleShortDataset ds = new DoubleShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleShortDataset getTrainingDatasetFromSplit() {
            return new DoubleShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleShortDataset getTestDatasetFromSplit() {
            return new DoubleShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class DoubleStringDataset extends Dataset<Double, String> {
        public DoubleStringDataset() {
        }

        public DoubleStringDataset(Dataset<Double, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static DoubleStringDataset of(DataFrame df) {
            DoubleStringDataset ds = new DoubleStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static DoubleStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static DoubleStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public DoubleStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public DoubleStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public DoubleStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public DoubleStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public DoubleStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public DoubleStringDataset getTrainingDatasetFromSplit() {
            return new DoubleStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public DoubleStringDataset getTestDatasetFromSplit() {
            return new DoubleStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Float ---
    public static class FloatBooleanDataset extends Dataset<Float, Boolean> {
        public FloatBooleanDataset() {
        }

        public FloatBooleanDataset(Dataset<Float, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatBooleanDataset of(DataFrame df) {
            FloatBooleanDataset ds = new FloatBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatBooleanDataset getTrainingDatasetFromSplit() {
            return new FloatBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatBooleanDataset getTestDatasetFromSplit() {
            return new FloatBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatByteDataset extends Dataset<Float, Byte> {
        public FloatByteDataset() {
        }

        public FloatByteDataset(Dataset<Float, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatByteDataset of(DataFrame df) {
            FloatByteDataset ds = new FloatByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatByteDataset getTrainingDatasetFromSplit() {
            return new FloatByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatByteDataset getTestDatasetFromSplit() {
            return new FloatByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatCharacterDataset extends Dataset<Float, Character> {
        public FloatCharacterDataset() {
        }

        public FloatCharacterDataset(Dataset<Float, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatCharacterDataset of(DataFrame df) {
            FloatCharacterDataset ds = new FloatCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatCharacterDataset getTrainingDatasetFromSplit() {
            return new FloatCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatCharacterDataset getTestDatasetFromSplit() {
            return new FloatCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatDoubleDataset extends Dataset<Float, Double> {
        public FloatDoubleDataset() {
        }

        public FloatDoubleDataset(Dataset<Float, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatDoubleDataset of(DataFrame df) {
            FloatDoubleDataset ds = new FloatDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatDoubleDataset getTrainingDatasetFromSplit() {
            return new FloatDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatDoubleDataset getTestDatasetFromSplit() {
            return new FloatDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatFloatDataset extends Dataset<Float, Float> {
        public FloatFloatDataset() {
        }

        public FloatFloatDataset(Dataset<Float, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatFloatDataset of(DataFrame df) {
            FloatFloatDataset ds = new FloatFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatFloatDataset getTrainingDatasetFromSplit() {
            return new FloatFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatFloatDataset getTestDatasetFromSplit() {
            return new FloatFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatIntegerDataset extends Dataset<Float, Integer> {
        public FloatIntegerDataset() {
        }

        public FloatIntegerDataset(Dataset<Float, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatIntegerDataset of(DataFrame df) {
            FloatIntegerDataset ds = new FloatIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatIntegerDataset getTrainingDatasetFromSplit() {
            return new FloatIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatIntegerDataset getTestDatasetFromSplit() {
            return new FloatIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatLongDataset extends Dataset<Float, Long> {
        public FloatLongDataset() {
        }

        public FloatLongDataset(Dataset<Float, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatLongDataset of(DataFrame df) {
            FloatLongDataset ds = new FloatLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatLongDataset getTrainingDatasetFromSplit() {
            return new FloatLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatLongDataset getTestDatasetFromSplit() {
            return new FloatLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatShortDataset extends Dataset<Float, Short> {
        public FloatShortDataset() {
        }

        public FloatShortDataset(Dataset<Float, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatShortDataset of(DataFrame df) {
            FloatShortDataset ds = new FloatShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatShortDataset getTrainingDatasetFromSplit() {
            return new FloatShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatShortDataset getTestDatasetFromSplit() {
            return new FloatShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class FloatStringDataset extends Dataset<Float, String> {
        public FloatStringDataset() {
        }

        public FloatStringDataset(Dataset<Float, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static FloatStringDataset of(DataFrame df) {
            FloatStringDataset ds = new FloatStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static FloatStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static FloatStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public FloatStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public FloatStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public FloatStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public FloatStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public FloatStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public FloatStringDataset getTrainingDatasetFromSplit() {
            return new FloatStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public FloatStringDataset getTestDatasetFromSplit() {
            return new FloatStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Integer ---
    public static class IntegerBooleanDataset extends Dataset<Integer, Boolean> {
        public IntegerBooleanDataset() {
        }

        public IntegerBooleanDataset(Dataset<Integer, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerBooleanDataset of(DataFrame df) {
            IntegerBooleanDataset ds = new IntegerBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerBooleanDataset getTrainingDatasetFromSplit() {
            return new IntegerBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerBooleanDataset getTestDatasetFromSplit() {
            return new IntegerBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerByteDataset extends Dataset<Integer, Byte> {
        public IntegerByteDataset() {
        }

        public IntegerByteDataset(Dataset<Integer, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerByteDataset of(DataFrame df) {
            IntegerByteDataset ds = new IntegerByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerByteDataset getTrainingDatasetFromSplit() {
            return new IntegerByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerByteDataset getTestDatasetFromSplit() {
            return new IntegerByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerCharacterDataset extends Dataset<Integer, Character> {
        public IntegerCharacterDataset() {
        }

        public IntegerCharacterDataset(Dataset<Integer, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerCharacterDataset of(DataFrame df) {
            IntegerCharacterDataset ds = new IntegerCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerCharacterDataset getTrainingDatasetFromSplit() {
            return new IntegerCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerCharacterDataset getTestDatasetFromSplit() {
            return new IntegerCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerDoubleDataset extends Dataset<Integer, Double> {
        public IntegerDoubleDataset() {
        }

        public IntegerDoubleDataset(Dataset<Integer, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerDoubleDataset of(DataFrame df) {
            IntegerDoubleDataset ds = new IntegerDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerDoubleDataset getTrainingDatasetFromSplit() {
            return new IntegerDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerDoubleDataset getTestDatasetFromSplit() {
            return new IntegerDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerFloatDataset extends Dataset<Integer, Float> {
        public IntegerFloatDataset() {
        }

        public IntegerFloatDataset(Dataset<Integer, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerFloatDataset of(DataFrame df) {
            IntegerFloatDataset ds = new IntegerFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerFloatDataset getTrainingDatasetFromSplit() {
            return new IntegerFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerFloatDataset getTestDatasetFromSplit() {
            return new IntegerFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerIntegerDataset extends Dataset<Integer, Integer> {
        public IntegerIntegerDataset() {
        }

        public IntegerIntegerDataset(Dataset<Integer, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerIntegerDataset of(DataFrame df) {
            IntegerIntegerDataset ds = new IntegerIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerIntegerDataset getTrainingDatasetFromSplit() {
            return new IntegerIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerIntegerDataset getTestDatasetFromSplit() {
            return new IntegerIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerLongDataset extends Dataset<Integer, Long> {
        public IntegerLongDataset() {
        }

        public IntegerLongDataset(Dataset<Integer, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerLongDataset of(DataFrame df) {
            IntegerLongDataset ds = new IntegerLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerLongDataset getTrainingDatasetFromSplit() {
            return new IntegerLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerLongDataset getTestDatasetFromSplit() {
            return new IntegerLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerShortDataset extends Dataset<Integer, Short> {
        public IntegerShortDataset() {
        }

        public IntegerShortDataset(Dataset<Integer, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerShortDataset of(DataFrame df) {
            IntegerShortDataset ds = new IntegerShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerShortDataset getTrainingDatasetFromSplit() {
            return new IntegerShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerShortDataset getTestDatasetFromSplit() {
            return new IntegerShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class IntegerStringDataset extends Dataset<Integer, String> {
        public IntegerStringDataset() {
        }

        public IntegerStringDataset(Dataset<Integer, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static IntegerStringDataset of(DataFrame df) {
            IntegerStringDataset ds = new IntegerStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static IntegerStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static IntegerStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public IntegerStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public IntegerStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public IntegerStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public IntegerStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public IntegerStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public IntegerStringDataset getTrainingDatasetFromSplit() {
            return new IntegerStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public IntegerStringDataset getTestDatasetFromSplit() {
            return new IntegerStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Long ---
    public static class LongBooleanDataset extends Dataset<Long, Boolean> {
        public LongBooleanDataset() {
        }

        public LongBooleanDataset(Dataset<Long, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongBooleanDataset of(DataFrame df) {
            LongBooleanDataset ds = new LongBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongBooleanDataset getTrainingDatasetFromSplit() {
            return new LongBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongBooleanDataset getTestDatasetFromSplit() {
            return new LongBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongByteDataset extends Dataset<Long, Byte> {
        public LongByteDataset() {
        }

        public LongByteDataset(Dataset<Long, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongByteDataset of(DataFrame df) {
            LongByteDataset ds = new LongByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongByteDataset getTrainingDatasetFromSplit() {
            return new LongByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongByteDataset getTestDatasetFromSplit() {
            return new LongByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongCharacterDataset extends Dataset<Long, Character> {
        public LongCharacterDataset() {
        }

        public LongCharacterDataset(Dataset<Long, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongCharacterDataset of(DataFrame df) {
            LongCharacterDataset ds = new LongCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongCharacterDataset getTrainingDatasetFromSplit() {
            return new LongCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongCharacterDataset getTestDatasetFromSplit() {
            return new LongCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongDoubleDataset extends Dataset<Long, Double> {
        public LongDoubleDataset() {
        }

        public LongDoubleDataset(Dataset<Long, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongDoubleDataset of(DataFrame df) {
            LongDoubleDataset ds = new LongDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongDoubleDataset getTrainingDatasetFromSplit() {
            return new LongDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongDoubleDataset getTestDatasetFromSplit() {
            return new LongDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongFloatDataset extends Dataset<Long, Float> {
        public LongFloatDataset() {
        }

        public LongFloatDataset(Dataset<Long, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongFloatDataset of(DataFrame df) {
            LongFloatDataset ds = new LongFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongFloatDataset getTrainingDatasetFromSplit() {
            return new LongFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongFloatDataset getTestDatasetFromSplit() {
            return new LongFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongIntegerDataset extends Dataset<Long, Integer> {
        public LongIntegerDataset() {
        }

        public LongIntegerDataset(Dataset<Long, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongIntegerDataset of(DataFrame df) {
            LongIntegerDataset ds = new LongIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongIntegerDataset getTrainingDatasetFromSplit() {
            return new LongIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongIntegerDataset getTestDatasetFromSplit() {
            return new LongIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongLongDataset extends Dataset<Long, Long> {
        public LongLongDataset() {
        }

        public LongLongDataset(Dataset<Long, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongLongDataset of(DataFrame df) {
            LongLongDataset ds = new LongLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongLongDataset getTrainingDatasetFromSplit() {
            return new LongLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongLongDataset getTestDatasetFromSplit() {
            return new LongLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongShortDataset extends Dataset<Long, Short> {
        public LongShortDataset() {
        }

        public LongShortDataset(Dataset<Long, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongShortDataset of(DataFrame df) {
            LongShortDataset ds = new LongShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongShortDataset getTrainingDatasetFromSplit() {
            return new LongShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongShortDataset getTestDatasetFromSplit() {
            return new LongShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class LongStringDataset extends Dataset<Long, String> {
        public LongStringDataset() {
        }

        public LongStringDataset(Dataset<Long, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static LongStringDataset of(DataFrame df) {
            LongStringDataset ds = new LongStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static LongStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static LongStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public LongStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public LongStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public LongStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public LongStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public LongStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public LongStringDataset getTrainingDatasetFromSplit() {
            return new LongStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public LongStringDataset getTestDatasetFromSplit() {
            return new LongStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- Short ---
    public static class ShortBooleanDataset extends Dataset<Short, Boolean> {
        public ShortBooleanDataset() {
        }

        public ShortBooleanDataset(Dataset<Short, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortBooleanDataset of(DataFrame df) {
            ShortBooleanDataset ds = new ShortBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortBooleanDataset getTrainingDatasetFromSplit() {
            return new ShortBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortBooleanDataset getTestDatasetFromSplit() {
            return new ShortBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortByteDataset extends Dataset<Short, Byte> {
        public ShortByteDataset() {
        }

        public ShortByteDataset(Dataset<Short, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortByteDataset of(DataFrame df) {
            ShortByteDataset ds = new ShortByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortByteDataset getTrainingDatasetFromSplit() {
            return new ShortByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortByteDataset getTestDatasetFromSplit() {
            return new ShortByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortCharacterDataset extends Dataset<Short, Character> {
        public ShortCharacterDataset() {
        }

        public ShortCharacterDataset(Dataset<Short, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortCharacterDataset of(DataFrame df) {
            ShortCharacterDataset ds = new ShortCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortCharacterDataset getTrainingDatasetFromSplit() {
            return new ShortCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortCharacterDataset getTestDatasetFromSplit() {
            return new ShortCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortDoubleDataset extends Dataset<Short, Double> {
        public ShortDoubleDataset() {
        }

        public ShortDoubleDataset(Dataset<Short, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortDoubleDataset of(DataFrame df) {
            ShortDoubleDataset ds = new ShortDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortDoubleDataset getTrainingDatasetFromSplit() {
            return new ShortDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortDoubleDataset getTestDatasetFromSplit() {
            return new ShortDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortFloatDataset extends Dataset<Short, Float> {
        public ShortFloatDataset() {
        }

        public ShortFloatDataset(Dataset<Short, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortFloatDataset of(DataFrame df) {
            ShortFloatDataset ds = new ShortFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortFloatDataset getTrainingDatasetFromSplit() {
            return new ShortFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortFloatDataset getTestDatasetFromSplit() {
            return new ShortFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortIntegerDataset extends Dataset<Short, Integer> {
        public ShortIntegerDataset() {
        }

        public ShortIntegerDataset(Dataset<Short, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortIntegerDataset of(DataFrame df) {
            ShortIntegerDataset ds = new ShortIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortIntegerDataset getTrainingDatasetFromSplit() {
            return new ShortIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortIntegerDataset getTestDatasetFromSplit() {
            return new ShortIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortLongDataset extends Dataset<Short, Long> {
        public ShortLongDataset() {
        }

        public ShortLongDataset(Dataset<Short, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortLongDataset of(DataFrame df) {
            ShortLongDataset ds = new ShortLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortLongDataset getTrainingDatasetFromSplit() {
            return new ShortLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortLongDataset getTestDatasetFromSplit() {
            return new ShortLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortShortDataset extends Dataset<Short, Short> {
        public ShortShortDataset() {
        }

        public ShortShortDataset(Dataset<Short, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortShortDataset of(DataFrame df) {
            ShortShortDataset ds = new ShortShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortShortDataset getTrainingDatasetFromSplit() {
            return new ShortShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortShortDataset getTestDatasetFromSplit() {
            return new ShortShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class ShortStringDataset extends Dataset<Short, String> {
        public ShortStringDataset() {
        }

        public ShortStringDataset(Dataset<Short, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static ShortStringDataset of(DataFrame df) {
            ShortStringDataset ds = new ShortStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static ShortStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static ShortStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public ShortStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public ShortStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public ShortStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public ShortStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public ShortStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public ShortStringDataset getTrainingDatasetFromSplit() {
            return new ShortStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public ShortStringDataset getTestDatasetFromSplit() {
            return new ShortStringDataset(super.getTestDatasetFromSplit());
        }
    }

    // --- String ---
    public static class StringBooleanDataset extends Dataset<String, Boolean> {
        public StringBooleanDataset() {
        }

        public StringBooleanDataset(Dataset<String, Boolean> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringBooleanDataset of(DataFrame df) {
            StringBooleanDataset ds = new StringBooleanDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringBooleanDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringBooleanDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringBooleanDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringBooleanDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringBooleanDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringBooleanDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringBooleanDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringBooleanDataset getTrainingDatasetFromSplit() {
            return new StringBooleanDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringBooleanDataset getTestDatasetFromSplit() {
            return new StringBooleanDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringByteDataset extends Dataset<String, Byte> {
        public StringByteDataset() {
        }

        public StringByteDataset(Dataset<String, Byte> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringByteDataset of(DataFrame df) {
            StringByteDataset ds = new StringByteDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringByteDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringByteDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringByteDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringByteDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringByteDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringByteDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringByteDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringByteDataset getTrainingDatasetFromSplit() {
            return new StringByteDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringByteDataset getTestDatasetFromSplit() {
            return new StringByteDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringCharacterDataset extends Dataset<String, Character> {
        public StringCharacterDataset() {
        }

        public StringCharacterDataset(Dataset<String, Character> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringCharacterDataset of(DataFrame df) {
            StringCharacterDataset ds = new StringCharacterDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringCharacterDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringCharacterDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringCharacterDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringCharacterDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringCharacterDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringCharacterDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringCharacterDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringCharacterDataset getTrainingDatasetFromSplit() {
            return new StringCharacterDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringCharacterDataset getTestDatasetFromSplit() {
            return new StringCharacterDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringDoubleDataset extends Dataset<String, Double> {
        public StringDoubleDataset() {
        }

        public StringDoubleDataset(Dataset<String, Double> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringDoubleDataset of(DataFrame df) {
            StringDoubleDataset ds = new StringDoubleDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringDoubleDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringDoubleDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringDoubleDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringDoubleDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringDoubleDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringDoubleDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringDoubleDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringDoubleDataset getTrainingDatasetFromSplit() {
            return new StringDoubleDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringDoubleDataset getTestDatasetFromSplit() {
            return new StringDoubleDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringFloatDataset extends Dataset<String, Float> {
        public StringFloatDataset() {
        }

        public StringFloatDataset(Dataset<String, Float> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringFloatDataset of(DataFrame df) {
            StringFloatDataset ds = new StringFloatDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringFloatDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringFloatDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringFloatDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringFloatDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringFloatDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringFloatDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringFloatDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringFloatDataset getTrainingDatasetFromSplit() {
            return new StringFloatDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringFloatDataset getTestDatasetFromSplit() {
            return new StringFloatDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringIntegerDataset extends Dataset<String, Integer> {
        public StringIntegerDataset() {
        }

        public StringIntegerDataset(Dataset<String, Integer> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringIntegerDataset of(DataFrame df) {
            StringIntegerDataset ds = new StringIntegerDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringIntegerDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringIntegerDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringIntegerDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringIntegerDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringIntegerDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringIntegerDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringIntegerDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringIntegerDataset getTrainingDatasetFromSplit() {
            return new StringIntegerDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringIntegerDataset getTestDatasetFromSplit() {
            return new StringIntegerDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringLongDataset extends Dataset<String, Long> {
        public StringLongDataset() {
        }

        public StringLongDataset(Dataset<String, Long> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringLongDataset of(DataFrame df) {
            StringLongDataset ds = new StringLongDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringLongDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringLongDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringLongDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringLongDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringLongDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringLongDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringLongDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringLongDataset getTrainingDatasetFromSplit() {
            return new StringLongDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringLongDataset getTestDatasetFromSplit() {
            return new StringLongDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringShortDataset extends Dataset<String, Short> {
        public StringShortDataset() {
        }

        public StringShortDataset(Dataset<String, Short> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringShortDataset of(DataFrame df) {
            StringShortDataset ds = new StringShortDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringShortDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringShortDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringShortDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringShortDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringShortDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringShortDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringShortDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringShortDataset getTrainingDatasetFromSplit() {
            return new StringShortDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringShortDataset getTestDatasetFromSplit() {
            return new StringShortDataset(super.getTestDatasetFromSplit());
        }
    }

    public static class StringStringDataset extends Dataset<String, String> {
        public StringStringDataset() {
        }

        public StringStringDataset(Dataset<String, String> base) {
            if (base != null) {
                this.dataPoints = base.dataPoints;
                this.dataFrame = base.dataFrame;
            }
        }

        public static StringStringDataset of(DataFrame df) {
            StringStringDataset ds = new StringStringDataset();
            ds.dataFrame = df;
            return ds;
        }

        public static StringStringDataset of(File file) {
            return of(DataFrame.read().csv(file));
        }

        public static StringStringDataset of(String url) {
            return of(DataFrame.read().csv(url));
        }

        @Override
        public StringStringDataset inputs(String... columns) {
            super.inputs(columns);
            return this;
        }

        @Override
        public StringStringDataset output(String column) {
            super.output(column);
            return this;
        }

        @Override
        public StringStringDataset build() {
            super.build();
            return this;
        }

        @Override
        public StringStringDataset split(double ratio) {
            super.split(ratio);
            return this;
        }

        @Override
        public StringStringDataset split(double ratio, int seed) {
            super.split(ratio, seed);
            return this;
        }

        @Override
        public StringStringDataset getTrainingDatasetFromSplit() {
            return new StringStringDataset(super.getTrainingDatasetFromSplit());
        }

        @Override
        public StringStringDataset getTestDatasetFromSplit() {
            return new StringStringDataset(super.getTestDatasetFromSplit());
        }
    }
}
