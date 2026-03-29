package io.github.dug22.tenoner.math.distance;

import java.util.List;

public abstract class Distance<I> {

    public abstract double apply(List<I> inputA, List<I> inputB);
}
