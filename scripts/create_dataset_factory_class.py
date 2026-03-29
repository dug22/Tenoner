returnTypes = ["Boolean", "Byte", "Character", "Double", "Float", "Long", "Integer", "Short", "String"]

print("import io.github.dug22.carpentry.DataFrame;")
print("import io.github.dug22.tenoner.data.DatasetFactory.*;")
print("import java.io.File;")
print()

for i in returnTypes:
    for j in returnTypes:
        className = i + j + "Dataset"
        print(f"public static class {className} extends Dataset<{i}, {j}> {{")

        # Empty Constructor
        print(f"    public {className}() {{ }}")
        print()

        # Base Constructor
        print(f"    public {className}(Dataset<{i}, {j}> base) {{")
        print(f"        if (base != null) {{")
        print(f"            this.dataPoints = base.dataPoints;")
        print(f"            this.dataFrame = base.dataFrame;")
        print(f"        }}")
        print(f"    }}")
        print()

        # Static Factory: DataFrame
        print(f"    public static {className} create{className}(DataFrame dataframe) {{")
        print(f"        return {className}.of(dataframe);")
        print(f"    }}")
        print()
        print(f"    public static {className} of(DataFrame df) {{")
        print(f"        {className} ds = new {className}();")
        print(f"        ds.dataFrame = df;")
        print(f"        return ds;")
        print(f"    }}")
        print()

        # Static Factory: File
        print(f"    public static {className} create{className}(File file) {{")
        print(f"        return {className}.of(file);")
        print(f"    }}")
        print()
        print(f"    public static {className} of(File file) {{")
        print(f"        return of(DataFrame.read().csv(file));")
        print(f"    }}")
        print()

        # Static Factory: String URL
        print(f"    public static {className} create{className}(String url) {{")
        print(f"        return {className}.of(url);")
        print(f"    }}")
        print()
        print(f"    public static {className} of(String url) {{")
        print(f"        return of(DataFrame.read().csv(url));")
        print(f"    }}")
        print()

        # Override methods
        print(f"    @Override public {className} inputs(String... columns) {{ super.inputs(columns); return this; }}")
        print(f"    @Override public {className} output(String column) {{ super.output(column); return this; }}")
        print(f"    @Override public {className} build() {{ super.build(); return this; }}")
        print(f"    @Override public {className} split(double ratio) {{ super.split(ratio); return this; }}")
        print(f"    @Override public {className} split(double ratio, int seed) {{ super.split(ratio, seed); return this; }}")
        print()

        # Split Getters
        print(f"    @Override public {className} getTrainingDatasetFromSplit() {{")
        print(f"        return new {className}(super.getTrainingDatasetFromSplit());")
        print(f"    }}")
        print()
        print(f"    @Override public {className} getTestDatasetFromSplit() {{")
        print(f"        return new {className}(super.getTestDatasetFromSplit());")
        print(f"    }}")

        print("}")
        print()