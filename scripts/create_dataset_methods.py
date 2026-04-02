inputReturnTypes = ["Byte", "Double", "Float", "Long", "Integer", "Short"]
outputReturnTypes = ["Boolean", "Byte", "Character", "Double", "Float", "Long", "Integer", "Short", "String"]
print("import io.github.dug22.carpentry.DataFrame;")
print("import io.github.dug22.tenoner.data.DatasetFactory.*;")
print("import java.io.File;")
print()
for i in inputReturnTypes:
  for j in outputReturnTypes:
    className = i + j + "Dataset"
    print(f"public static  {className}  create  {className}(String url){{\n")
    print(f"return {className}.of(url);\n")
    print("}")
    print()
    print(f"public static  {className}  create  {className}(File file){{\n")
    print(f"return {className}.of(file);\n")
    print("}")
    print()
    print(f"public static  {className}  create  {className}(DataFrame dataframe){{\n")
    print(f"return {className}.of(dataframe);\n")
    print("}")
print("}")