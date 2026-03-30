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

    public DataFrame encodeAsIntegers( String... columnNames) {
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

    private DataFrame encode(boolean asIntegers, boolean verbose, String... columnNames) {
        for (String columnName : columnNames) {
            Column<?> column = dataFrame.getColumn(columnName);
            int currentPosition = dataFrame.getColumnIndex(columnName);
            Object[] uniqueValues = column.unique().getValues();

            if (asIntegers) {
                if(verbose){
                    System.out.println(columnName + "Encodings");
                }
                Map<Object, Integer> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {

                    if(!encodingMap.containsKey(uniqueValues[i]) && verbose){
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
                if(verbose){
                    System.out.println(columnName + " Encodings");
                }
                Map<Object, Double> encodingMap = new HashMap<>();
                for (int i = 0; i < uniqueValues.length; i++) {
                    if(!encodingMap.containsKey(uniqueValues[i]) && verbose){
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
