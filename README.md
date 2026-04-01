<div align="center">

Tenoner
====
</div>
<div align="center">

[![Apache 2.0](https://img.shields.io/github/license/nebula-plugins/nebula-project-plugin.svg)](http://www.apache.org/licenses/LICENSE-2.0) [![Stars](https://img.shields.io/github/stars/dug22/Tenoner.svg)](https://github.com/dug22/Tenoner/stargazers) [![Java](https://img.shields.io/badge/java-23-red)](#)
</div>

Tenoner is a lightweight, Java-based supervised machine learning library that allows developers and researchers to efficiently build, train,
and evaluate custom classifier models, supporting both binary and categorical classification algorithms. Tenoner integrates with [Carpentry](( https://github.com/dug22/carpentry) )
(a Java-based dataframe and visualization library) simplifying dataset loading, data normalization, and the definition of input features and output
labels. Tenoner also integrates with [GSON](https://github.com/google/gson), making it easy to save and load trained models.
Tenoner offers developers with many common machine learning classifier algorithms, including:

- KNN Classifier ✅
- Naive Bayes ✅
- Perceptron ✅
- Binomial Logistic Regression ✅
- Multinomial Logistic Regression ✅

## Getting Started
- The current release of Tenoner is 1.0.0, and supports version Java 23+. Tenoner will not work unless you have Java 23 installed on your system.
- Unfortunately Tenoner is currently not in Maven Central. To use Tenoner, download the release of choice and build it with Maven after installing 
Carpentry and GSON.
  - Since these libraries are available in Maven Central, add the appropriate dependencies for these libraries (Carpentry and GSON) into your pom.xml file.
    - ```xml
        <dependencies>
          <dependency>
              <groupId>io.github.dug22</groupId>
              <artifactId>carpentry</artifactId>
              <version>1.0.7.5</version>
          </dependency>
          <dependency>
              <groupId>com.google.code.gson</groupId>
              <artifactId>gson</artifactId>
              <version>2.13.2</version>
          </dependency>
      </dependencies>
      ```
      - Next, download the jar file from the releases tab, which can be accessed through here: https://github.com/dug22/Tenoner/releases
        - I recommend downloading the latest version, but download the version of your choice.
      - Place the jar file, in an appropriate spot that you'll easily remember. 
      - Open your terminal and type the following command. The jar will be copied into your Maven local repository.
        ```shell 
        mvn install:install-file -Dfile=/path/to/Tenoner-1-0-0.jar -DgroupId=io.github.dug22 -DartifactId=Tenoner -Dversion=1.0.0 -Dpackaging=jar
        ```
      - After installation, just add Tenoner as a dependency in your pom.xml, then you are good to go!
        - ```xml
           <dependency>
              <groupId>io.github.dug22</groupId>
              <artifactId>Tenoner</artifactId>
              <version>1.0.0</version>
          </dependency>
          ```
          
## Why use Tenoner?
Tenoner can be used for research and other specialized purposes. Tenoner, among other Java-based machine learning libraries. 
Tenoner specializes in making classification tasks easy to carry out. Tenoner allows you to define the proper features and labels
from the dataset you’re working with, contains a handful of machine learning classification algorithms to utilize, and Tenoner
provides you with the capability of normalizing and encoding your data. 

## Documentation
I have written an official [User Guide](https://github.com/dug22/Tenoner/blob/master/UserGuide.md) that explains how to use Tenoner and serves as a helpful starting point for working with the library.
I have also created an [Examples](https://github.com/dug22/Tenoner/tree/master/src/test/java/io/github/dug22/tenoner_test) section, to demonstrate how to perform classifier tasks with Tenoner.
I plan on adding more examples in future updates.

## License
Tenoner is released under the [Apache 2.0 License](https://github.com/dug22/Tenoner/blob/master/LICENSE)

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## **Contributions**
Contributions are welcome! If you have suggestions, bug fixes, or enhancements, please open an issue to share them.
