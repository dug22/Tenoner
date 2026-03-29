package io.github.dug22.tenoner.math.distance;

import java.util.List;

public class EuclideanDistance<I> extends Distance<I>{

    @Override
    public double apply(List<I> inputA, List<I> inputB) {
        double distance = 0.0;
        int index = 0;
        while (index < inputA.size()) {
            double valueA = ((Number) inputA.get(index)).doubleValue();
            double valueB = ((Number) inputB.get(index)).doubleValue();
            distance += Math.pow(valueA - valueB, 2);
            index++;
        }

        return Math.sqrt(distance);
    }
}
