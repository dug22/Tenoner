<div style="text-align: center;">
<h1>Tenoner User Guide</h1>
</div>

## Table of Contents
1. [Overview](#overview)
2. [Getting Started](#getting-started)
3. [Data Normalization](#data-normalization)
4. [Datasets](#datasets)
    * [What are Datasets](#what-are-datasets)
    * [Creating Datasets and Defining its Parameters](#creating-datasets-and-defining-its-parameters)
5. [Machine Learning Models and Algorithms](#machine-learning-models-and-algorithms)
6. [Saving and Loading Trained Models](#saving-and-loading-trained-models)

<div align="justify">

## Overview
Tenoner is a well-rounded Java-based machine learning library that enables developers to create and train their own custom classification models.
Tenoner integrates with Carpentry (a Java-based dataframe and visualization library) https://github.com/dug22/carpentry simplifying dataset loading,
data normalization, and the definition of input features and output labels. Tenoner tries to follow a simple API design, removing noise for developers.

## Getting Started
- Ensure that you have Java 23+ installed on your machine.
- Tenoner is currently not in Maven Central. To use Tenoner, clone the appropriate repository and build it with Maven after installing Carpentry on your system.

## Data Normalization

Data normalization provide developers the capability of scaling or normalizing their data to train models better. 
Tenoner's data normalization module contains the following formulas:

- Min-Max Normalization
- Z score
- Log

These formulas can come in handy when you're training classification models. Here is an example of you can normalize your data using Tenoner:

```java
import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.tenoner.Tenoner;

DataFrame df = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/aapl_stock_data.csv");
df = Tenoner.dataNormalizer()
                .setDataFrame(df)
                .setColumns("High","Low","Close")
                .setFormula(DataNormalizer.DataNormalizerFormula.MIN_MAX)
                .normalize();
df.head();
```

This will add 3 columns to your dataframe called "High_min_max", "Low_min_max", "Close_min_max".

```
┌───────────────────────────┬───────────────────┬───────────────────┬───────────────────┬───────────────────┬───────────┬───────────┬──────────────┬─────────────────────┬─────────────────────┬─────────────────────┐
│ Date                      │ Open              │ High              │ Low               │ Close             │ Volume    │ Dividends │ Stock Splits │ High_min_max        │ Low_min_max         │ Close_min_max       │
├───────────────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────┼───────────┼──────────────┼─────────────────────┼─────────────────────┼─────────────────────┤
│ 2020-01-02 00:00:00-05:00 │ 71.79987336808419 │ 72.85661316556887 │ 71.54538716413333 │ 72.7960205078125  │ 135480400 │ 0.0       │ 0.0          │ 0.08477319777289283 │ 0.09657699559588971 │ 0.08941488622632812 │
│ 2020-01-03 00:00:00-05:00 │ 72.0204315021118  │ 72.85176099103282 │ 71.86289207131898 │ 72.08829498291016 │ 146322800 │ 0.0       │ 0.0          │ 0.08474948083359365 │ 0.0981184515242693  │ 0.08595429878001637 │
│ 2020-01-06 00:00:00-05:00 │ 71.20606963688756 │ 72.70149228565275 │ 70.95400211001883 │ 72.66271209716797 │ 118387200 │ 0.0       │ 0.0          │ 0.0840149825715087  │ 0.09370587777380561 │ 0.0887630439567874  │
│ 2020-01-07 00:00:00-05:00 │ 72.67240156846412 │ 72.9293138189329  │ 72.10041048902463 │ 72.32096862792969 │ 108872000 │ 0.0       │ 0.0          │ 0.08512855122731472 │ 0.09927158070364803 │ 0.08709201031748463 │
│ 2020-01-08 00:00:00-05:00 │ 72.02285002693742 │ 73.78730773933461 │ 72.02285002693742 │ 73.48434448242188 │ 132079200 │ 0.0       │ 0.0          │ 0.08932233889468409 │ 0.09889503208538596 │ 0.09278060531051305 │
└───────────────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────┴───────────┴──────────────┴─────────────────────┴─────────────────────┴─────────────────────┘
```

## Datasets

### What are Datasets?
A dataset in Tenoner is an object that contains predefined inputs (features) and outputs (labels). Datasets play a crucial role in model training and testing. 

### Creating Datasets and Defining its Parameters
Creating a dataset and defining its parameters is a relatively simple process. Datasets integrate with Carpentry, allowing you to define which columns you'd like to be features and labels.
Tenoner has done its absolute best in removing noise from its API when creating datasets. Let's say you wanted to create a dataset with double-based features and string-based labels, you can do so by doing this

Let's say you wanted to use the Iris dataset to classify the name of the iris plant based on its features, which are "SepalLength, "SepalWidth, PetalLength, and Petal Width"
You can simply accomplish such a task by doing the following:

```java
 DoubleStringDataset irisDataset = Tenoner.createDoubleStringDataset("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/iris.csv")
                .inputs("SepalLength","SepalWidth","PetalLength","PetalWidth") //Set yours inputs/features
                .output("Name") //Sets your outputs/labels (what you want your model to classify)
                .build() //Make sure you call .build
                .split(0.8, 42); //Splits the dataset into 2 80% of your data will be used for training and 20% of your data will be used for testing.
                                //42 resembles our seed (it's optional)
```
We use a DoubleString-based dataset because our input features are doubles, while our output labels are strings. 
To specify the appropriate dataset type, simply match the object types of your inputs and outputs. For instance, 
if your inputs are integers and your outputs are strings, you would use an IntegerStringDataset. For more details, refer to “DatasetFactory.java.”
One last thing, always make sure to call “.split()” after “.build()”, to split your dataset into 2 separate datasets.

## Machine Learning Models and Algorithms
Tenoner provides developers with many common machine learning algorithms to utilize, including:
- KNN Classifiers ✅
- Naive Bayes ✅
- Perceptron ✅
- Binomial Logistic Regression ✅
- Multinomial Logistic Regression ✅

To get an idea how they work take a look at [Tenonor's Examples](https://github.com/dug22/Tenoner/tree/master/src/test/java/io/github/dug22/tenoner_test). 



## Saving and Loading Trained Models
Tenoner allows you to save and load trained models. Tenoner utilizes GSON to serialize and deserialize model objects


To save a model you can simply do:

```java
//Model training/evaluation code

import io.github.dug22.tenoner.Tenoner;

Tenoner.modelManager()
        .saveModel(modelInstance, "/path/to/model.json");
```

To load a model you can simply do:

```java
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.models.impl.NaiveBayes;

NaiveBayes naiveBayesModel = (NaiveBayes) Tenoner.modelManager().loadModel("/path/to/model.json");
//Making predictions
int prediction = naiveBayesModel.predict(List.of(20D));
System.out.println("Prediction for x is " + prediction);
```

If you have any questions, suggestions, etc., please don't hesitate to create an issue.
</div>
