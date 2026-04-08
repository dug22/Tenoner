package io.github.dug22.tenoner.data.encoder;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.Column;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.IntegerColumn;

import java.util.HashMap;
import java.util.Map;

public class DataEncoder {

    private DataFrame dataFrame;

    public static DataEncoder getInstance() {
        return new DataEncoder();
    }

    public DataEncoder setDataFrame(DataFrame dataFrame) {
        this.dataFrame = dataFrame;
        return this;
    }

    public DataFrame encodeAsIntegers(String... columnNames) {
        return encode(true, false, columnNames);
    }

    public DataFrame encodeAsIntegers(boolean verbose, String... columnNames) {
        return encode(true, verbose, columnNames);
    }

    public DataFrame encodeAsDoubles(String... columnNames) {
        return encode(false, false, columnNames);
    }

    public DataFrame encodeAsDoubles(boolean verbose, String... columnNames) {
        return encode(false, verbose, columnNames);
    }

    public DataFrame encodeAsIntegersWithCustomOrder(Map<String, Object[]> columnsAndValuesMap) {
        return encodeAsIntegersWithCustomOrder(false, columnsAndValuesMap);
    }

    public DataFrame encodeAsIntegersWithCustomOrder(boolean verbose, Map<String, Object[]> columnsAndValuesMap) {
        return encodeWithCustomOrder(true, verbose, columnsAndValuesMap);
    }

    public DataFrame encodeAsDoublesWithCustomOrder(Map<String, Object[]> columnsAndValuesMap) {
        return encodeAsDoublesWithCustomOrder(false, columnsAndValuesMap);
    }

    public DataFrame encodeAsDoublesWithCustomOrder(boolean verbose, Map<String, Object[]> columnsAndValuesMap) {
        return encodeWithCustomOrder(false, verbose, columnsAndValuesMap);
    }


    private DataFrame encodeWithCustomOrder(boolean asIntegers, boolean verbose, Map<String, Object[]> columns) {
        for (String columnName : columns.keySet()) {
            Column<?> column = dataFrame.getColumn(columnName);
            int currentPosition = dataFrame.getColumnIndex(columnName);
            Object[] orderedValues = columns.get(columnName);
            Map<Object, Integer> encodingMap = new HashMap<>();
            if (verbose) {
                System.out.println(columnName + " Encodings");
            }
            for (int i = 0; i < orderedValues.length; i++) {
                encodingMap.put(orderedValues[i], i);

                if (encodingMap.containsKey(orderedValues[i]) && verbose) {
                    if (asIntegers) {
                        System.out.println("Encoding " + orderedValues[i] + " to " + i);
                    } else {
                        System.out.println("Encoding " + orderedValues[i] + " to " + (double) i);
                    }
                }
            }

            if (asIntegers) {
                IntegerColumn encoded = IntegerColumn.create(columnName);
                for (Object val : column.getValues()) {
                    encoded.append(encodingMap.getOrDefault(val, -1));
                }
                dataFrame.replaceColumn(currentPosition, encoded);
            } else {
                DoubleColumn encoded = DoubleColumn.create(columnName);
                for (Object val : column.getValues()) {
                    Integer idx = encodingMap.get(val);
                    encoded.append(idx != null ? encodingMap.get(val) : -1.0);
                }
                dataFrame.replaceColumn(currentPosition, encoded);
            }
        }
        return dataFrame;
    }

    private DataFrame encode(boolean asIntegers, boolean verbose, String... columnNames) {
        for (String columnName : columnNames) {
            Column<?> column = dataFrame.getColumn(columnName);
            int currentPosition = dataFrame.getColumnIndex(columnName);
            Object[] uniqueValues = column.unique().getValues();
            if (asIntegers) {
                if (verbose) {
                    System.out.println(columnName + "Encodings");
                }
                Map<Object, Integer> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {

                    if (!encodingMap.containsKey(uniqueValues[i]) && verbose) {
                        System.out.println("Encoding " + uniqueValues[i] + " to " + i);
                    }

                    encodingMap.put(uniqueValues[i], i);

                }

                IntegerColumn encodedColumn = IntegerColumn.create(columnName);
                for (Object val : column.getValues()) {
                    encodedColumn.append(encodingMap.get(val));
                }
                dataFrame.replaceColumn(currentPosition, encodedColumn);
            } else {
                if (verbose) {
                    System.out.println(columnName + " Encodings");
                }
                Map<Object, Double> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {
                    if (!encodingMap.containsKey(uniqueValues[i]) && verbose) {
                        System.out.println("Encoding " + uniqueValues[i] + " to " + i);
                    }
                    encodingMap.put(uniqueValues[i], (double) i);
                }

                DoubleColumn encodedColumn = DoubleColumn.create(columnName);
                for (Object val : column.getValues()) {
                    encodedColumn.append(encodingMap.get(val));
                }
                dataFrame.replaceColumn(currentPosition, encodedColumn);
            }
        }
        return dataFrame;
    }
}
