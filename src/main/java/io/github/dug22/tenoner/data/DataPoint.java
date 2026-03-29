package io.github.dug22.tenoner.data;

import java.io.Serializable;
import java.util.List;

public record DataPoint<I, O>(List<I> input, O output) implements Serializable {
}
