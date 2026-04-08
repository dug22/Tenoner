package io.github.dug22.tenoner_test;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.carpentry.column.impl.DoubleColumn;
import io.github.dug22.carpentry.fill.FillColumnValuePair;
import io.github.dug22.tenoner.Tenoner;
import io.github.dug22.tenoner.data.DatasetFactory;
import io.github.dug22.tenoner.math.distance.DistanceFormula;
import io.github.dug22.tenoner.models.impl.KNNClassifier;
import io.github.dug22.tenoner.models.impl.MultinomialLogisticRegression;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TitanicExample extends AbstractExample {

    private DataFrame dataFrame;
    private DatasetFactory.DoubleIntegerDataset dataset;
    private KNNClassifier<Double, Integer> knnClassifier;
    private MultinomialLogisticRegression<Double, Integer> multinomialLogisticRegression;

    @Override
    protected void defineDataframe() {
        out("=== Defining Our DataFrame ===");
        dataFrame = DataFrame.read().csv("https://raw.githubusercontent.com/dug22/datasets/refs/heads/main/titanic.csv");
        Map<String, Double> titleMap = Map.of(
                "Mr", 1D,
                "Miss", 2D,
                "Mrs", 3D,
                "Master", 4D,
                "Royal", 5D,
                "Rare", 6D
        );
        DoubleColumn ageGroupColumn = DoubleColumn.create("Age Group");
        for (String name : dataFrame.stringColumn("Name").getValues()) {
            String groupedTitle = getTitle(name);
            ageGroupColumn.append(titleMap.getOrDefault(groupedTitle, 0D));
        }

        ageGroupColumn.head();
        dataFrame = dataFrame.addColumn(ageGroupColumn);
        dataFrame = dataFrame.drop("PassengerId", "Name", "Ticket", "Cabin", "Age");
        dataFrame = dataFrame.fillNa(new FillColumnValuePair[]{
                new FillColumnValuePair("Embarked", "S"),
                new FillColumnValuePair("Fare", dataFrame.doubleColumn("Fare").mean())
        });

        dataFrame = dataFrame
                .replaceColumn(dataFrame.getColumnIndex("Pclass"), dataFrame.intColumn("Pclass").asDoubleColumn())
                .replaceColumn(dataFrame.getColumnIndex("Parch"), dataFrame.intColumn("Parch").asDoubleColumn())
                .replaceColumn(dataFrame.getColumnIndex("SibSp"), dataFrame.intColumn("SibSp").asDoubleColumn());
        dataFrame = Tenoner.featureEncoder()
                .setDataFrame(dataFrame)
                .encodeAsDoublesWithCustomOrder(true,
                        Map.of(
                                "Sex", new String[]{"male", "female"},
                                "Embarked", new String[]{"S", "C", "Q"}
                        ));
        dataFrame.head();
        out();
    }

    @Override
    protected void defineDataset() {
        dataset = Tenoner.createDoubleIntegerDataset(dataFrame)
                .inputs("Pclass", "Sex", "Age Group", "SibSp", "Fare", "Embarked")
                .output("Survived")
                .build()
                .split(0.8, 42);
    }

    @SuppressWarnings("all")
    @Override
    protected void defineModel() {
        out("=== Defining Our Model ===");
        out("Models of Choice: KNN Classifier using Manhattan's Distance, and Multinomial Logistic Regression");
        out();
        knnClassifier = (KNNClassifier<Double, Integer>) Tenoner.knn()
                .k(5)
                .formula(DistanceFormula.MANHATTAN_DISTANCE)
                .build();
        multinomialLogisticRegression = (MultinomialLogisticRegression<Double, Integer>) Tenoner.multinomialLogisticRegressionDefault();
    }

    @Override
    protected void trainAndEvaluateModel() {
        out("=== Training and Evaluating Our Models ===");
        DatasetFactory.DoubleIntegerDataset trainingDataset = dataset.getTrainingDatasetFromSplit();
        DatasetFactory.DoubleIntegerDataset testDataset = dataset.getTestDatasetFromSplit();
        knnClassifier.train(trainingDataset);
        List<Integer> knnPredictions = knnClassifier.test(testDataset);
        knnClassifier.evaluateAccuracy(testDataset.getDataPoints(), knnPredictions);
        knnClassifier.summary();
        out();

        multinomialLogisticRegression.train(trainingDataset);
        List<Integer> multinomialPredictions = multinomialLogisticRegression.test(testDataset);
        multinomialLogisticRegression.evaluateAccuracy(testDataset.getDataPoints(), multinomialPredictions);
        multinomialLogisticRegression.summary();
        out();
    }

    @Override
    protected void testPredictions() {
        //No predictions for this example are needed. I decided to compare and contrast model performance
    }


    protected void printModelAccuracies() {
        out("--- Model Accuracy Comparison ---");
        Map.of(
                        "KNN", knnClassifier.getScores().getLast() * 100,
                        "Multinomial Logistic Regression", multinomialLogisticRegression.getScores().getLast() * 100
                ).entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, _) -> o1, LinkedHashMap::new))
                .forEach((key, value) -> out(key + " Accuracy: " + value + "%"));
    }

    private String getTitle(String name) {
        String title = name.replaceAll(".*, (.*?)\\..*", "$1");
        String groupedTitle;
        if (List.of("Lady", "Capt", "Col", "Don", "Dr", "Major", "Rev", "Jonkheer", "Dona").contains(title)) {
            groupedTitle = "Rare";
        } else if (List.of("Countess", "Sir").contains(title)) {
            groupedTitle = "Royal";
        } else if (title.equals("Mlle") || title.equals("Ms")) {
            groupedTitle = "Miss";
        } else if (title.equals("Mme")) {
            groupedTitle = "Mrs";
        } else {
            groupedTitle = title;
        }
        return groupedTitle;
    }

    public static void main(String[] args) {
        TitanicExample titanicExample = new TitanicExample();
        titanicExample.defineDataframe();
        titanicExample.defineDataset();
        titanicExample.defineModel();
        titanicExample.trainAndEvaluateModel();
        titanicExample.printModelAccuracies();
    }
}
