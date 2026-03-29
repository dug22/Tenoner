package io.github.dug22.tenoner.math;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;

public class DataNormalizer {


    public enum DataNormalizerFormula {

        MIN_MAX() {
            public DoubleColumn apply(DoubleColumn column) {
                double min = column.min();
                double max = column.max();
                return column.apply(i -> (i - min) / (max - min));
            }
        },

        Z_SCORE() {
            public DoubleColumn apply(DoubleColumn column){
                double mean = column.mean();
                double standardDeviation = column.populationSTD();
                return  column.apply(i -> (i - mean) / standardDeviation);
            }
        },


        LOG {
            public DoubleColumn apply(DoubleColumn column){
                return column.apply(Math::log);
            }
        };

        public abstract DoubleColumn apply(DoubleColumn col);
    }


    private DataFrame dataFrame;
    private String[] columns;
    private DataNormalizerFormula formula;

    public static DataNormalizer getInstance() {
        return new DataNormalizer();
    }

    public DataNormalizer setDataFrame(DataFrame dataFrame) {
        this.dataFrame = dataFrame;
        return this;
    }

    public DataNormalizer setColumns(String... columns) {
        this.columns = columns;
        return this;
    }

    public DataNormalizer setFormula(DataNormalizerFormula formula) {
        this.formula = formula;
        return this;
    }

    public DataFrame normalize() {
        for (String column : columns) {
            if (dataFrame.getColumn(column) instanceof DoubleColumn target) {
                DoubleColumn normalizedColumn = formula.apply(target);
                normalizedColumn.setName(normalizedColumn.name() + "_" + formula.toString().toLowerCase());
                dataFrame.addColumn(normalizedColumn);
            }
        }

        return dataFrame;
    }
}
