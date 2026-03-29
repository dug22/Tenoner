package io.github.dug22.tenoner.data;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.Column;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.IntegerColumn;

import java.util.HashMap;
import java.util.Map;

public class LabelEncoder {

    private DataFrame dataFrame;


    public static LabelEncoder getInstance() {
        return new LabelEncoder();
    }

    public LabelEncoder setDataFrame(DataFrame dataFrame) {
        this.dataFrame = dataFrame;
        return this;
    }

    public DataFrame encodeAsIntegers(String... columnNames) {
        return encode(true, columnNames);
    }

    public DataFrame encodeAsDoubles(String... columnNames) {
        return encode(false, columnNames);
    }

    private DataFrame encode(boolean asIntegers, String... columnNames) {
        for (String columnName : columnNames) {
            Column<?> column = dataFrame.getColumn(columnName);
            int currentPosition = dataFrame.getColumnIndex(columnName);
            System.out.println(currentPosition);
            Object[] uniqueValues = column.unique().getValues();

            if (asIntegers) {
                Map<Object, Integer> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {
                    encodingMap.put(uniqueValues[i], i);
                }

                IntegerColumn encodedColumn = IntegerColumn.create(columnName);
                for (Object val : column.getValues()) {
                    encodedColumn.append(encodingMap.get(val));
                }
                dataFrame.replaceColumn(currentPosition, encodedColumn);
            } else {
                Map<Object, Double> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {
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
