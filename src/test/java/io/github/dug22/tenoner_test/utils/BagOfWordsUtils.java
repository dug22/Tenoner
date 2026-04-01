package io.github.dug22.tenoner_test.utils;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.column.impl.StringColumn;

import java.util.*;

public class BagOfWordsUtils {

    public static Set<String> buildVocab(String[] textValues) {
        Set<String> vocab = new HashSet<>();
        for (String text : textValues) {
            vocab.addAll(Arrays.asList(text.split("\\s+")));
        }
        return vocab;
    }

    public static void createVectorColumns(DataFrame dataFrame, StringColumn targetTextColumn, Set<String> vocab) {
        int rowCount = dataFrame.getRowCount();
        for (String word : vocab) {
            Double[] counts = new Double[rowCount];
            for (int i = 0; i < rowCount; i++) {
                counts[i] = (double) Arrays.stream(
                                targetTextColumn.get(i).split("\\s+"))
                        .filter(w -> w.equals(word)).count();
            }

            dataFrame.addColumn(DoubleColumn.create(word + "_count", counts));
        }
    }

    public static String cleanText(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("\\p{Punct}", "");
        return text;
    }
}
