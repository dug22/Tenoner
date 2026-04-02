package io.github.dug22.tenoner.data.encoder;

import io.github.dug22.carpentry.DataFrame;

import java.util.Map;

public class LabelEncoder extends DataEncoder {

    public static LabelEncoder getInstance(){
        return new LabelEncoder();
    }

    @Override
    public DataEncoder setDataFrame(DataFrame dataFrame) {
        return super.setDataFrame(dataFrame);
    }

    @Override
    public DataFrame encodeAsIntegers(String... columnNames) {
        return super.encodeAsIntegers(columnNames);
    }

    @Override
    public DataFrame encodeAsIntegers(boolean verbose, String... columnNames) {
        return super.encodeAsIntegers(verbose, columnNames);
    }

    @Override
    public DataFrame encodeAsDoubles(String... columnNames) {
        return super.encodeAsDoubles(columnNames);
    }

    @Override
    public DataFrame encodeAsDoubles(boolean verbose, String... columnNames) {
        return super.encodeAsDoubles(verbose, columnNames);
    }

    @Override
    public DataFrame encodeAsIntegersWithCustomOrder(Map<String, Object[]> columnsAndValuesMap) {
        return super.encodeAsIntegersWithCustomOrder(columnsAndValuesMap);
    }

    @Override
    public DataFrame encodeAsIntegersWithCustomOrder(boolean verbose, Map<String, Object[]> columnsAndValuesMap) {
        return super.encodeAsIntegersWithCustomOrder(verbose, columnsAndValuesMap);
    }

    @Override
    public DataFrame encodeAsDoublesWithCustomOrder(Map<String, Object[]> columnsAndValuesMap) {
        return super.encodeAsDoublesWithCustomOrder(columnsAndValuesMap);
    }

    @Override
    public DataFrame encodeAsDoublesWithCustomOrder(boolean verbose, Map<String, Object[]> columnsAndValuesMap) {
        return super.encodeAsDoublesWithCustomOrder(verbose, columnsAndValuesMap);
    }
}
