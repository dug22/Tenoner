package io.github.dug22.tenoner;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.tenoner.data.DatasetFactory.*;
import io.github.dug22.tenoner.data.LabelEncoder;
import io.github.dug22.tenoner.math.DataNormalizer;
import io.github.dug22.tenoner.models.ModelManager;
import io.github.dug22.tenoner.models.impl.*;

import java.io.File;

public class Tenoner {

    /**
     * Gets a labelEncoder instance
     *
     * @return a new LabelEncoder instance
     */
    public static LabelEncoder labelEncoder() {
        return LabelEncoder.getInstance();
    }

    /**
     * Gets a ModelManager instance
     *
     * @return a new ModelManager instance
     */
    public static ModelManager modelManager() {
        return new ModelManager();
    }

    /**
     * Gets a DataNormalizer instance
     *
     * @return a new DataNormalizer instance
     */
    public static DataNormalizer dataNormalizer() {
        return DataNormalizer.getInstance();
    }

    /**
     * Creates a KNNClassifier builder instance allowing users to configure KNNClassifier's parameters
     *
     * @return a KNNClassifier Builder
     */
    public static KNNClassifier.Builder knn() {
        return new KNNClassifier.Builder();
    }

    /**
     * Creates a KNNClassifier instance using KNNClassifier's default parameters
     *
     * @return a KNNClassifier
     */
    public static KNNClassifier<?, ?> knnDefault() {
        return new KNNClassifier.Builder().build();
    }

    /**
     * Creates a BinomialLogisticRegression builder instance allowing users to configure BinomialLogisticRegression's parameters
     *
     * @return a BinomialLogisticRegression Builder
     */
    public static BinomialLogisticRegression.Builder binomialLogisticRegression() {
        return new BinomialLogisticRegression.Builder();
    }

    /**
     * Creates a BinomialLogisticRegression instance using BinomialLogisticRegression's default parameters
     *
     * @return a BinomialLogisticRegression
     */
    public static BinomialLogisticRegression binomialLogisticRegressionDefault() {
        return new BinomialLogisticRegression.Builder().build();
    }

    /**
     * Creates a MultinomialLogisticRegression builder instance allowing users to configure MultinomialLogisticRegression's parameters
     *
     * @return a MultinomialLogisticRegression Builder model
     */
    public static MultinomialLogisticRegression.Builder multinomialLogisticRegression() {
        return new MultinomialLogisticRegression.Builder();
    }

    /**
     * Creates a MultinomialLogisticRegression instance using MultinomialLogisticRegression's default parameters
     *
     * @return a MultinomialLogisticRegression model
     */
    public static MultinomialLogisticRegression<?, ?> multinomialLogisticRegressionDefault() {
        return new MultinomialLogisticRegression.Builder().build();
    }

    /**
     * Creates a NaiveBayes instance using NaiveBayes's default parameters
     *
     * @return a NaiveBayes
     */
    public static NaiveBayes naiveBayes() {
        return new NaiveBayes();
    }

    /**
     * Creates a Perceptron builder instance allowing users to configure Perceptron's parameters
     *
     * @return a Perceptron Builder
     */
    public static Perceptron.Builder perceptron() {
        return new Perceptron.Builder();
    }

    /**
     * Creates a Perceptron instance using Perceptron's default parameters
     *
     * @return a Perceptron
     */
    public static Perceptron perceptronDefault() {
        return new Perceptron.Builder().build();
    }

    /**
     * Creates a BooleanBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanBooleanDataset
     */

    public static BooleanBooleanDataset createBooleanBooleanDataset(String url) {
        return BooleanBooleanDataset.of(url);
    }

    /**
     * Creates a BooleanBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanBooleanDataset
     */

    public static BooleanBooleanDataset createBooleanBooleanDataset(File file) {
        return BooleanBooleanDataset.of(file);
    }

    /**
     * Creates a BooleanBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanBooleanDataset
     */

    public static BooleanBooleanDataset createBooleanBooleanDataset(DataFrame dataframe) {
        return BooleanBooleanDataset.of(dataframe);
    }

    /**
     * Creates a BooleanByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanByteDataset
     */

    public static BooleanByteDataset createBooleanByteDataset(String url) {
        return BooleanByteDataset.of(url);
    }

    /**
     * Creates a BooleanByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanByteDataset
     */

    public static BooleanByteDataset createBooleanByteDataset(File file) {
        return BooleanByteDataset.of(file);
    }

    /**
     * Creates a BooleanByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanByteDataset
     */

    public static BooleanByteDataset createBooleanByteDataset(DataFrame dataframe) {
        return BooleanByteDataset.of(dataframe);
    }

    /**
     * Creates a BooleanCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanCharacterDataset
     */

    public static BooleanCharacterDataset createBooleanCharacterDataset(String url) {
        return BooleanCharacterDataset.of(url);
    }

    /**
     * Creates a BooleanCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanCharacterDataset
     */

    public static BooleanCharacterDataset createBooleanCharacterDataset(File file) {
        return BooleanCharacterDataset.of(file);
    }

    /**
     * Creates a BooleanCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanCharacterDataset
     */

    public static BooleanCharacterDataset createBooleanCharacterDataset(DataFrame dataframe) {
        return BooleanCharacterDataset.of(dataframe);
    }

    /**
     * Creates a BooleanDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanDoubleDataset
     */

    public static BooleanDoubleDataset createBooleanDoubleDataset(String url) {
        return BooleanDoubleDataset.of(url);
    }

    /**
     * Creates a BooleanDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanDoubleDataset
     */

    public static BooleanDoubleDataset createBooleanDoubleDataset(File file) {
        return BooleanDoubleDataset.of(file);
    }

    /**
     * Creates a BooleanDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanDoubleDataset
     */

    public static BooleanDoubleDataset createBooleanDoubleDataset(DataFrame dataframe) {
        return BooleanDoubleDataset.of(dataframe);
    }

    /**
     * Creates a BooleanFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanFloatDataset
     */

    public static BooleanFloatDataset createBooleanFloatDataset(String url) {
        return BooleanFloatDataset.of(url);
    }

    /**
     * Creates a BooleanFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanFloatDataset
     */

    public static BooleanFloatDataset createBooleanFloatDataset(File file) {
        return BooleanFloatDataset.of(file);
    }

    /**
     * Creates a BooleanFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanFloatDataset
     */

    public static BooleanFloatDataset createBooleanFloatDataset(DataFrame dataframe) {
        return BooleanFloatDataset.of(dataframe);
    }

    /**
     * Creates a BooleanIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanIntegerDataset
     */

    public static BooleanIntegerDataset createBooleanIntegerDataset(String url) {
        return BooleanIntegerDataset.of(url);
    }

    /**
     * Creates a BooleanIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanIntegerDataset
     */

    public static BooleanIntegerDataset createBooleanIntegerDataset(File file) {
        return BooleanIntegerDataset.of(file);
    }

    /**
     * Creates a BooleanIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanIntegerDataset
     */

    public static BooleanIntegerDataset createBooleanIntegerDataset(DataFrame dataframe) {
        return BooleanIntegerDataset.of(dataframe);
    }

    /**
     * Creates a BooleanLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanLongDataset
     */

    public static BooleanLongDataset createBooleanLongDataset(String url) {
        return BooleanLongDataset.of(url);
    }

    /**
     * Creates a BooleanLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanLongDataset
     */

    public static BooleanLongDataset createBooleanLongDataset(File file) {
        return BooleanLongDataset.of(file);
    }

    /**
     * Creates a BooleanLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanLongDataset
     */

    public static BooleanLongDataset createBooleanLongDataset(DataFrame dataframe) {
        return BooleanLongDataset.of(dataframe);
    }

    /**
     * Creates a BooleanShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanShortDataset
     */

    public static BooleanShortDataset createBooleanShortDataset(String url) {
        return BooleanShortDataset.of(url);
    }

    /**
     * Creates a BooleanShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanShortDataset
     */

    public static BooleanShortDataset createBooleanShortDataset(File file) {
        return BooleanShortDataset.of(file);
    }

    /**
     * Creates a BooleanShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanShortDataset
     */

    public static BooleanShortDataset createBooleanShortDataset(DataFrame dataframe) {
        return BooleanShortDataset.of(dataframe);
    }

    /**
     * Creates a BooleanStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a BooleanStringDataset
     */

    public static BooleanStringDataset createBooleanStringDataset(String url) {
        return BooleanStringDataset.of(url);
    }

    /**
     * Creates a BooleanStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a BooleanStringDataset
     */

    public static BooleanStringDataset createBooleanStringDataset(File file) {
        return BooleanStringDataset.of(file);
    }

    /**
     * Creates a BooleanStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a BooleanStringDataset
     */

    public static BooleanStringDataset createBooleanStringDataset(DataFrame dataframe) {
        return BooleanStringDataset.of(dataframe);
    }

    /**
     * Creates a ByteBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteBooleanDataset
     */

    public static ByteBooleanDataset createByteBooleanDataset(String url) {
        return ByteBooleanDataset.of(url);
    }

    /**
     * Creates a ByteBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteBooleanDataset
     */

    public static ByteBooleanDataset createByteBooleanDataset(File file) {
        return ByteBooleanDataset.of(file);
    }

    /**
     * Creates a ByteBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteBooleanDataset
     */

    public static ByteBooleanDataset createByteBooleanDataset(DataFrame dataframe) {
        return ByteBooleanDataset.of(dataframe);
    }

    /**
     * Creates a ByteByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteByteDataset
     */

    public static ByteByteDataset createByteByteDataset(String url) {
        return ByteByteDataset.of(url);
    }

    /**
     * Creates a ByteByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteByteDataset
     */

    public static ByteByteDataset createByteByteDataset(File file) {
        return ByteByteDataset.of(file);
    }

    /**
     * Creates a ByteByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteByteDataset
     */

    public static ByteByteDataset createByteByteDataset(DataFrame dataframe) {
        return ByteByteDataset.of(dataframe);
    }

    /**
     * Creates a ByteCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteCharacterDataset
     */

    public static ByteCharacterDataset createByteCharacterDataset(String url) {
        return ByteCharacterDataset.of(url);
    }

    /**
     * Creates a ByteCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteCharacterDataset
     */

    public static ByteCharacterDataset createByteCharacterDataset(File file) {
        return ByteCharacterDataset.of(file);
    }

    /**
     * Creates a ByteCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteCharacterDataset
     */

    public static ByteCharacterDataset createByteCharacterDataset(DataFrame dataframe) {
        return ByteCharacterDataset.of(dataframe);
    }

    /**
     * Creates a ByteDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteDoubleDataset
     */

    public static ByteDoubleDataset createByteDoubleDataset(String url) {
        return ByteDoubleDataset.of(url);
    }

    /**
     * Creates a ByteDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteDoubleDataset
     */

    public static ByteDoubleDataset createByteDoubleDataset(File file) {
        return ByteDoubleDataset.of(file);
    }

    /**
     * Creates a ByteDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteDoubleDataset
     */

    public static ByteDoubleDataset createByteDoubleDataset(DataFrame dataframe) {
        return ByteDoubleDataset.of(dataframe);
    }

    /**
     * Creates a ByteFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteFloatDataset
     */

    public static ByteFloatDataset createByteFloatDataset(String url) {
        return ByteFloatDataset.of(url);
    }

    /**
     * Creates a ByteFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteFloatDataset
     */

    public static ByteFloatDataset createByteFloatDataset(File file) {
        return ByteFloatDataset.of(file);
    }

    /**
     * Creates a ByteFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteFloatDataset
     */

    public static ByteFloatDataset createByteFloatDataset(DataFrame dataframe) {
        return ByteFloatDataset.of(dataframe);
    }

    /**
     * Creates a ByteIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteIntegerDataset
     */

    public static ByteIntegerDataset createByteIntegerDataset(String url) {
        return ByteIntegerDataset.of(url);
    }

    /**
     * Creates a ByteIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteIntegerDataset
     */

    public static ByteIntegerDataset createByteIntegerDataset(File file) {
        return ByteIntegerDataset.of(file);
    }

    /**
     * Creates a ByteIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteIntegerDataset
     */

    public static ByteIntegerDataset createByteIntegerDataset(DataFrame dataframe) {
        return ByteIntegerDataset.of(dataframe);
    }

    /**
     * Creates a ByteLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteLongDataset
     */

    public static ByteLongDataset createByteLongDataset(String url) {
        return ByteLongDataset.of(url);
    }

    /**
     * Creates a ByteLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteLongDataset
     */

    public static ByteLongDataset createByteLongDataset(File file) {
        return ByteLongDataset.of(file);
    }

    /**
     * Creates a ByteLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteLongDataset
     */

    public static ByteLongDataset createByteLongDataset(DataFrame dataframe) {
        return ByteLongDataset.of(dataframe);
    }

    /**
     * Creates a ByteShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteShortDataset
     */

    public static ByteShortDataset createByteShortDataset(String url) {
        return ByteShortDataset.of(url);
    }

    /**
     * Creates a ByteShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteShortDataset
     */

    public static ByteShortDataset createByteShortDataset(File file) {
        return ByteShortDataset.of(file);
    }

    /**
     * Creates a ByteShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteShortDataset
     */

    public static ByteShortDataset createByteShortDataset(DataFrame dataframe) {
        return ByteShortDataset.of(dataframe);
    }

    /**
     * Creates a ByteStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ByteStringDataset
     */

    public static ByteStringDataset createByteStringDataset(String url) {
        return ByteStringDataset.of(url);
    }

    /**
     * Creates a ByteStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ByteStringDataset
     */

    public static ByteStringDataset createByteStringDataset(File file) {
        return ByteStringDataset.of(file);
    }

    /**
     * Creates a ByteStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ByteStringDataset
     */

    public static ByteStringDataset createByteStringDataset(DataFrame dataframe) {
        return ByteStringDataset.of(dataframe);
    }

    /**
     * Creates a CharacterBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterBooleanDataset
     */

    public static CharacterBooleanDataset createCharacterBooleanDataset(String url) {
        return CharacterBooleanDataset.of(url);
    }

    /**
     * Creates a CharacterBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterBooleanDataset
     */

    public static CharacterBooleanDataset createCharacterBooleanDataset(File file) {
        return CharacterBooleanDataset.of(file);
    }

    /**
     * Creates a CharacterBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterBooleanDataset
     */

    public static CharacterBooleanDataset createCharacterBooleanDataset(DataFrame dataframe) {
        return CharacterBooleanDataset.of(dataframe);
    }

    /**
     * Creates a CharacterByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterByteDataset
     */

    public static CharacterByteDataset createCharacterByteDataset(String url) {
        return CharacterByteDataset.of(url);
    }

    /**
     * Creates a CharacterByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterByteDataset
     */

    public static CharacterByteDataset createCharacterByteDataset(File file) {
        return CharacterByteDataset.of(file);
    }

    /**
     * Creates a CharacterByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterByteDataset
     */

    public static CharacterByteDataset createCharacterByteDataset(DataFrame dataframe) {
        return CharacterByteDataset.of(dataframe);
    }

    /**
     * Creates a CharacterCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterCharacterDataset
     */

    public static CharacterCharacterDataset createCharacterCharacterDataset(String url) {
        return CharacterCharacterDataset.of(url);
    }

    /**
     * Creates a CharacterCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterCharacterDataset
     */

    public static CharacterCharacterDataset createCharacterCharacterDataset(File file) {
        return CharacterCharacterDataset.of(file);
    }

    /**
     * Creates a CharacterCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterCharacterDataset
     */

    public static CharacterCharacterDataset createCharacterCharacterDataset(DataFrame dataframe) {
        return CharacterCharacterDataset.of(dataframe);
    }

    /**
     * Creates a CharacterDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterDoubleDataset
     */

    public static CharacterDoubleDataset createCharacterDoubleDataset(String url) {
        return CharacterDoubleDataset.of(url);
    }

    /**
     * Creates a CharacterDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterDoubleDataset
     */

    public static CharacterDoubleDataset createCharacterDoubleDataset(File file) {
        return CharacterDoubleDataset.of(file);
    }

    /**
     * Creates a CharacterDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterDoubleDataset
     */

    public static CharacterDoubleDataset createCharacterDoubleDataset(DataFrame dataframe) {
        return CharacterDoubleDataset.of(dataframe);
    }

    /**
     * Creates a CharacterFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterFloatDataset
     */

    public static CharacterFloatDataset createCharacterFloatDataset(String url) {
        return CharacterFloatDataset.of(url);
    }

    /**
     * Creates a CharacterFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterFloatDataset
     */

    public static CharacterFloatDataset createCharacterFloatDataset(File file) {
        return CharacterFloatDataset.of(file);
    }

    /**
     * Creates a CharacterFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterFloatDataset
     */

    public static CharacterFloatDataset createCharacterFloatDataset(DataFrame dataframe) {
        return CharacterFloatDataset.of(dataframe);
    }

    /**
     * Creates a CharacterIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterIntegerDataset
     */

    public static CharacterIntegerDataset createCharacterIntegerDataset(String url) {
        return CharacterIntegerDataset.of(url);
    }

    /**
     * Creates a CharacterIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterIntegerDataset
     */

    public static CharacterIntegerDataset createCharacterIntegerDataset(File file) {
        return CharacterIntegerDataset.of(file);
    }

    /**
     * Creates a CharacterIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterIntegerDataset
     */

    public static CharacterIntegerDataset createCharacterIntegerDataset(DataFrame dataframe) {
        return CharacterIntegerDataset.of(dataframe);
    }

    /**
     * Creates a CharacterLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterLongDataset
     */

    public static CharacterLongDataset createCharacterLongDataset(String url) {
        return CharacterLongDataset.of(url);
    }

    /**
     * Creates a CharacterLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterLongDataset
     */

    public static CharacterLongDataset createCharacterLongDataset(File file) {
        return CharacterLongDataset.of(file);
    }

    /**
     * Creates a CharacterLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterLongDataset
     */

    public static CharacterLongDataset createCharacterLongDataset(DataFrame dataframe) {
        return CharacterLongDataset.of(dataframe);
    }

    /**
     * Creates a CharacterShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterShortDataset
     */

    public static CharacterShortDataset createCharacterShortDataset(String url) {
        return CharacterShortDataset.of(url);
    }

    /**
     * Creates a CharacterShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterShortDataset
     */

    public static CharacterShortDataset createCharacterShortDataset(File file) {
        return CharacterShortDataset.of(file);
    }

    /**
     * Creates a CharacterShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterShortDataset
     */

    public static CharacterShortDataset createCharacterShortDataset(DataFrame dataframe) {
        return CharacterShortDataset.of(dataframe);
    }

    /**
     * Creates a CharacterStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a CharacterStringDataset
     */

    public static CharacterStringDataset createCharacterStringDataset(String url) {
        return CharacterStringDataset.of(url);
    }

    /**
     * Creates a CharacterStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a CharacterStringDataset
     */

    public static CharacterStringDataset createCharacterStringDataset(File file) {
        return CharacterStringDataset.of(file);
    }

    /**
     * Creates a CharacterStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a CharacterStringDataset
     */

    public static CharacterStringDataset createCharacterStringDataset(DataFrame dataframe) {
        return CharacterStringDataset.of(dataframe);
    }

    /**
     * Creates a DoubleBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleBooleanDataset
     */

    public static DoubleBooleanDataset createDoubleBooleanDataset(String url) {
        return DoubleBooleanDataset.of(url);
    }

    /**
     * Creates a DoubleBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleBooleanDataset
     */

    public static DoubleBooleanDataset createDoubleBooleanDataset(File file) {
        return DoubleBooleanDataset.of(file);
    }

    /**
     * Creates a DoubleBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleBooleanDataset
     */

    public static DoubleBooleanDataset createDoubleBooleanDataset(DataFrame dataframe) {
        return DoubleBooleanDataset.of(dataframe);
    }

    /**
     * Creates a DoubleByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleByteDataset
     */

    public static DoubleByteDataset createDoubleByteDataset(String url) {
        return DoubleByteDataset.of(url);
    }

    /**
     * Creates a DoubleByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleByteDataset
     */

    public static DoubleByteDataset createDoubleByteDataset(File file) {
        return DoubleByteDataset.of(file);
    }

    /**
     * Creates a DoubleByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleByteDataset
     */

    public static DoubleByteDataset createDoubleByteDataset(DataFrame dataframe) {
        return DoubleByteDataset.of(dataframe);
    }

    /**
     * Creates a DoubleCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleCharacterDataset
     */

    public static DoubleCharacterDataset createDoubleCharacterDataset(String url) {
        return DoubleCharacterDataset.of(url);
    }

    /**
     * Creates a DoubleCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleCharacterDataset
     */

    public static DoubleCharacterDataset createDoubleCharacterDataset(File file) {
        return DoubleCharacterDataset.of(file);
    }

    /**
     * Creates a DoubleCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleCharacterDataset
     */

    public static DoubleCharacterDataset createDoubleCharacterDataset(DataFrame dataframe) {
        return DoubleCharacterDataset.of(dataframe);
    }

    /**
     * Creates a DoubleDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleDoubleDataset
     */

    public static DoubleDoubleDataset createDoubleDoubleDataset(String url) {
        return DoubleDoubleDataset.of(url);
    }

    /**
     * Creates a DoubleDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleDoubleDataset
     */

    public static DoubleDoubleDataset createDoubleDoubleDataset(File file) {
        return DoubleDoubleDataset.of(file);
    }

    /**
     * Creates a DoubleDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleDoubleDataset
     */

    public static DoubleDoubleDataset createDoubleDoubleDataset(DataFrame dataframe) {
        return DoubleDoubleDataset.of(dataframe);
    }

    /**
     * Creates a DoubleFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleFloatDataset
     */

    public static DoubleFloatDataset createDoubleFloatDataset(String url) {
        return DoubleFloatDataset.of(url);
    }

    /**
     * Creates a DoubleFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleFloatDataset
     */

    public static DoubleFloatDataset createDoubleFloatDataset(File file) {
        return DoubleFloatDataset.of(file);
    }

    /**
     * Creates a DoubleFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleFloatDataset
     */

    public static DoubleFloatDataset createDoubleFloatDataset(DataFrame dataframe) {
        return DoubleFloatDataset.of(dataframe);
    }

    /**
     * Creates a DoubleIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleIntegerDataset
     */

    public static DoubleIntegerDataset createDoubleIntegerDataset(String url) {
        return DoubleIntegerDataset.of(url);
    }

    /**
     * Creates a DoubleIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleIntegerDataset
     */

    public static DoubleIntegerDataset createDoubleIntegerDataset(File file) {
        return DoubleIntegerDataset.of(file);
    }

    /**
     * Creates a DoubleIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleIntegerDataset
     */

    public static DoubleIntegerDataset createDoubleIntegerDataset(DataFrame dataframe) {
        return DoubleIntegerDataset.of(dataframe);
    }

    /**
     * Creates a DoubleLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleLongDataset
     */

    public static DoubleLongDataset createDoubleLongDataset(String url) {
        return DoubleLongDataset.of(url);
    }

    /**
     * Creates a DoubleLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleLongDataset
     */

    public static DoubleLongDataset createDoubleLongDataset(File file) {
        return DoubleLongDataset.of(file);
    }

    /**
     * Creates a DoubleLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleLongDataset
     */

    public static DoubleLongDataset createDoubleLongDataset(DataFrame dataframe) {
        return DoubleLongDataset.of(dataframe);
    }

    /**
     * Creates a DoubleShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleShortDataset
     */

    public static DoubleShortDataset createDoubleShortDataset(String url) {
        return DoubleShortDataset.of(url);
    }

    /**
     * Creates a DoubleShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleShortDataset
     */

    public static DoubleShortDataset createDoubleShortDataset(File file) {
        return DoubleShortDataset.of(file);
    }

    /**
     * Creates a DoubleShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleShortDataset
     */

    public static DoubleShortDataset createDoubleShortDataset(DataFrame dataframe) {
        return DoubleShortDataset.of(dataframe);
    }

    /**
     * Creates a DoubleStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a DoubleStringDataset
     */

    public static DoubleStringDataset createDoubleStringDataset(String url) {
        return DoubleStringDataset.of(url);
    }

    /**
     * Creates a DoubleStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a DoubleStringDataset
     */

    public static DoubleStringDataset createDoubleStringDataset(File file) {
        return DoubleStringDataset.of(file);
    }

    /**
     * Creates a DoubleStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a DoubleStringDataset
     */

    public static DoubleStringDataset createDoubleStringDataset(DataFrame dataframe) {
        return DoubleStringDataset.of(dataframe);
    }

    /**
     * Creates a FloatBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatBooleanDataset
     */

    public static FloatBooleanDataset createFloatBooleanDataset(String url) {
        return FloatBooleanDataset.of(url);
    }

    /**
     * Creates a FloatBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatBooleanDataset
     */

    public static FloatBooleanDataset createFloatBooleanDataset(File file) {
        return FloatBooleanDataset.of(file);
    }

    /**
     * Creates a FloatBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatBooleanDataset
     */

    public static FloatBooleanDataset createFloatBooleanDataset(DataFrame dataframe) {
        return FloatBooleanDataset.of(dataframe);
    }

    /**
     * Creates a FloatByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatByteDataset
     */

    public static FloatByteDataset createFloatByteDataset(String url) {
        return FloatByteDataset.of(url);
    }

    /**
     * Creates a FloatByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatByteDataset
     */

    public static FloatByteDataset createFloatByteDataset(File file) {
        return FloatByteDataset.of(file);
    }

    /**
     * Creates a FloatByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatByteDataset
     */

    public static FloatByteDataset createFloatByteDataset(DataFrame dataframe) {
        return FloatByteDataset.of(dataframe);
    }

    /**
     * Creates a FloatCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatCharacterDataset
     */

    public static FloatCharacterDataset createFloatCharacterDataset(String url) {
        return FloatCharacterDataset.of(url);
    }

    /**
     * Creates a FloatCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatCharacterDataset
     */

    public static FloatCharacterDataset createFloatCharacterDataset(File file) {
        return FloatCharacterDataset.of(file);
    }

    /**
     * Creates a FloatCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatCharacterDataset
     */

    public static FloatCharacterDataset createFloatCharacterDataset(DataFrame dataframe) {
        return FloatCharacterDataset.of(dataframe);
    }

    /**
     * Creates a FloatDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatDoubleDataset
     */

    public static FloatDoubleDataset createFloatDoubleDataset(String url) {
        return FloatDoubleDataset.of(url);
    }

    /**
     * Creates a FloatDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatDoubleDataset
     */

    public static FloatDoubleDataset createFloatDoubleDataset(File file) {
        return FloatDoubleDataset.of(file);
    }

    /**
     * Creates a FloatDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatDoubleDataset
     */

    public static FloatDoubleDataset createFloatDoubleDataset(DataFrame dataframe) {
        return FloatDoubleDataset.of(dataframe);
    }

    /**
     * Creates a FloatFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatFloatDataset
     */

    public static FloatFloatDataset createFloatFloatDataset(String url) {
        return FloatFloatDataset.of(url);
    }

    /**
     * Creates a FloatFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatFloatDataset
     */

    public static FloatFloatDataset createFloatFloatDataset(File file) {
        return FloatFloatDataset.of(file);
    }

    /**
     * Creates a FloatFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatFloatDataset
     */

    public static FloatFloatDataset createFloatFloatDataset(DataFrame dataframe) {
        return FloatFloatDataset.of(dataframe);
    }

    /**
     * Creates a FloatIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatIntegerDataset
     */

    public static FloatIntegerDataset createFloatIntegerDataset(String url) {
        return FloatIntegerDataset.of(url);
    }

    /**
     * Creates a FloatIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatIntegerDataset
     */

    public static FloatIntegerDataset createFloatIntegerDataset(File file) {
        return FloatIntegerDataset.of(file);
    }

    /**
     * Creates a FloatIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatIntegerDataset
     */

    public static FloatIntegerDataset createFloatIntegerDataset(DataFrame dataframe) {
        return FloatIntegerDataset.of(dataframe);
    }

    /**
     * Creates a FloatLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatLongDataset
     */

    public static FloatLongDataset createFloatLongDataset(String url) {
        return FloatLongDataset.of(url);
    }

    /**
     * Creates a FloatLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatLongDataset
     */

    public static FloatLongDataset createFloatLongDataset(File file) {
        return FloatLongDataset.of(file);
    }

    /**
     * Creates a FloatLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatLongDataset
     */

    public static FloatLongDataset createFloatLongDataset(DataFrame dataframe) {
        return FloatLongDataset.of(dataframe);
    }

    /**
     * Creates a FloatShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatShortDataset
     */

    public static FloatShortDataset createFloatShortDataset(String url) {
        return FloatShortDataset.of(url);
    }

    /**
     * Creates a FloatShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatShortDataset
     */

    public static FloatShortDataset createFloatShortDataset(File file) {
        return FloatShortDataset.of(file);
    }

    /**
     * Creates a FloatShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatShortDataset
     */

    public static FloatShortDataset createFloatShortDataset(DataFrame dataframe) {
        return FloatShortDataset.of(dataframe);
    }

    /**
     * Creates a FloatStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a FloatStringDataset
     */

    public static FloatStringDataset createFloatStringDataset(String url) {
        return FloatStringDataset.of(url);
    }

    /**
     * Creates a FloatStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a FloatStringDataset
     */

    public static FloatStringDataset createFloatStringDataset(File file) {
        return FloatStringDataset.of(file);
    }

    /**
     * Creates a FloatStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a FloatStringDataset
     */

    public static FloatStringDataset createFloatStringDataset(DataFrame dataframe) {
        return FloatStringDataset.of(dataframe);
    }

    /**
     * Creates a IntegerBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerBooleanDataset
     */

    public static IntegerBooleanDataset createIntegerBooleanDataset(String url) {
        return IntegerBooleanDataset.of(url);
    }

    /**
     * Creates a IntegerBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerBooleanDataset
     */

    public static IntegerBooleanDataset createIntegerBooleanDataset(File file) {
        return IntegerBooleanDataset.of(file);
    }

    /**
     * Creates a IntegerBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerBooleanDataset
     */

    public static IntegerBooleanDataset createIntegerBooleanDataset(DataFrame dataframe) {
        return IntegerBooleanDataset.of(dataframe);
    }

    /**
     * Creates a IntegerByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerByteDataset
     */

    public static IntegerByteDataset createIntegerByteDataset(String url) {
        return IntegerByteDataset.of(url);
    }

    /**
     * Creates a IntegerByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerByteDataset
     */

    public static IntegerByteDataset createIntegerByteDataset(File file) {
        return IntegerByteDataset.of(file);
    }

    /**
     * Creates a IntegerByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerByteDataset
     */

    public static IntegerByteDataset createIntegerByteDataset(DataFrame dataframe) {
        return IntegerByteDataset.of(dataframe);
    }

    /**
     * Creates a IntegerCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerCharacterDataset
     */

    public static IntegerCharacterDataset createIntegerCharacterDataset(String url) {
        return IntegerCharacterDataset.of(url);
    }

    /**
     * Creates a IntegerCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerCharacterDataset
     */

    public static IntegerCharacterDataset createIntegerCharacterDataset(File file) {
        return IntegerCharacterDataset.of(file);
    }

    /**
     * Creates a IntegerCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerCharacterDataset
     */

    public static IntegerCharacterDataset createIntegerCharacterDataset(DataFrame dataframe) {
        return IntegerCharacterDataset.of(dataframe);
    }

    /**
     * Creates a IntegerDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerDoubleDataset
     */

    public static IntegerDoubleDataset createIntegerDoubleDataset(String url) {
        return IntegerDoubleDataset.of(url);
    }

    /**
     * Creates a IntegerDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerDoubleDataset
     */

    public static IntegerDoubleDataset createIntegerDoubleDataset(File file) {
        return IntegerDoubleDataset.of(file);
    }

    /**
     * Creates a IntegerDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerDoubleDataset
     */

    public static IntegerDoubleDataset createIntegerDoubleDataset(DataFrame dataframe) {
        return IntegerDoubleDataset.of(dataframe);
    }

    /**
     * Creates a IntegerFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerFloatDataset
     */

    public static IntegerFloatDataset createIntegerFloatDataset(String url) {
        return IntegerFloatDataset.of(url);
    }

    /**
     * Creates a IntegerFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerFloatDataset
     */

    public static IntegerFloatDataset createIntegerFloatDataset(File file) {
        return IntegerFloatDataset.of(file);
    }

    /**
     * Creates a IntegerFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerFloatDataset
     */

    public static IntegerFloatDataset createIntegerFloatDataset(DataFrame dataframe) {
        return IntegerFloatDataset.of(dataframe);
    }

    /**
     * Creates a IntegerIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerIntegerDataset
     */

    public static IntegerIntegerDataset createIntegerIntegerDataset(String url) {
        return IntegerIntegerDataset.of(url);
    }

    /**
     * Creates a IntegerIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerIntegerDataset
     */

    public static IntegerIntegerDataset createIntegerIntegerDataset(File file) {
        return IntegerIntegerDataset.of(file);
    }

    /**
     * Creates a IntegerIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerIntegerDataset
     */

    public static IntegerIntegerDataset createIntegerIntegerDataset(DataFrame dataframe) {
        return IntegerIntegerDataset.of(dataframe);
    }

    /**
     * Creates a IntegerLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerLongDataset
     */

    public static IntegerLongDataset createIntegerLongDataset(String url) {
        return IntegerLongDataset.of(url);
    }

    /**
     * Creates a IntegerLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerLongDataset
     */

    public static IntegerLongDataset createIntegerLongDataset(File file) {
        return IntegerLongDataset.of(file);
    }

    /**
     * Creates a IntegerLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerLongDataset
     */

    public static IntegerLongDataset createIntegerLongDataset(DataFrame dataframe) {
        return IntegerLongDataset.of(dataframe);
    }

    /**
     * Creates a IntegerShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerShortDataset
     */

    public static IntegerShortDataset createIntegerShortDataset(String url) {
        return IntegerShortDataset.of(url);
    }

    /**
     * Creates a IntegerShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerShortDataset
     */

    public static IntegerShortDataset createIntegerShortDataset(File file) {
        return IntegerShortDataset.of(file);
    }

    /**
     * Creates a IntegerShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerShortDataset
     */

    public static IntegerShortDataset createIntegerShortDataset(DataFrame dataframe) {
        return IntegerShortDataset.of(dataframe);
    }

    /**
     * Creates a IntegerStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a IntegerStringDataset
     */

    public static IntegerStringDataset createIntegerStringDataset(String url) {
        return IntegerStringDataset.of(url);
    }

    /**
     * Creates a IntegerStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a IntegerStringDataset
     */

    public static IntegerStringDataset createIntegerStringDataset(File file) {
        return IntegerStringDataset.of(file);
    }

    /**
     * Creates a IntegerStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a IntegerStringDataset
     */

    public static IntegerStringDataset createIntegerStringDataset(DataFrame dataframe) {
        return IntegerStringDataset.of(dataframe);
    }

    /**
     * Creates a LongBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongBooleanDataset
     */

    public static LongBooleanDataset createLongBooleanDataset(String url) {
        return LongBooleanDataset.of(url);
    }

    /**
     * Creates a LongBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongBooleanDataset
     */

    public static LongBooleanDataset createLongBooleanDataset(File file) {
        return LongBooleanDataset.of(file);
    }

    /**
     * Creates a LongBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongBooleanDataset
     */

    public static LongBooleanDataset createLongBooleanDataset(DataFrame dataframe) {
        return LongBooleanDataset.of(dataframe);
    }

    /**
     * Creates a LongByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongByteDataset
     */

    public static LongByteDataset createLongByteDataset(String url) {
        return LongByteDataset.of(url);
    }

    /**
     * Creates a LongByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongByteDataset
     */

    public static LongByteDataset createLongByteDataset(File file) {
        return LongByteDataset.of(file);
    }

    /**
     * Creates a LongByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongByteDataset
     */

    public static LongByteDataset createLongByteDataset(DataFrame dataframe) {
        return LongByteDataset.of(dataframe);
    }

    /**
     * Creates a LongCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongCharacterDataset
     */

    public static LongCharacterDataset createLongCharacterDataset(String url) {
        return LongCharacterDataset.of(url);
    }

    /**
     * Creates a LongCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongCharacterDataset
     */

    public static LongCharacterDataset createLongCharacterDataset(File file) {
        return LongCharacterDataset.of(file);
    }

    /**
     * Creates a LongCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongCharacterDataset
     */

    public static LongCharacterDataset createLongCharacterDataset(DataFrame dataframe) {
        return LongCharacterDataset.of(dataframe);
    }

    /**
     * Creates a LongDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongDoubleDataset
     */

    public static LongDoubleDataset createLongDoubleDataset(String url) {
        return LongDoubleDataset.of(url);
    }

    /**
     * Creates a LongDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongDoubleDataset
     */

    public static LongDoubleDataset createLongDoubleDataset(File file) {
        return LongDoubleDataset.of(file);
    }

    /**
     * Creates a LongDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongDoubleDataset
     */

    public static LongDoubleDataset createLongDoubleDataset(DataFrame dataframe) {
        return LongDoubleDataset.of(dataframe);
    }

    /**
     * Creates a LongFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongFloatDataset
     */

    public static LongFloatDataset createLongFloatDataset(String url) {
        return LongFloatDataset.of(url);
    }

    /**
     * Creates a LongFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongFloatDataset
     */

    public static LongFloatDataset createLongFloatDataset(File file) {
        return LongFloatDataset.of(file);
    }

    /**
     * Creates a LongFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongFloatDataset
     */

    public static LongFloatDataset createLongFloatDataset(DataFrame dataframe) {
        return LongFloatDataset.of(dataframe);
    }

    /**
     * Creates a LongIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongIntegerDataset
     */

    public static LongIntegerDataset createLongIntegerDataset(String url) {
        return LongIntegerDataset.of(url);
    }

    /**
     * Creates a LongIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongIntegerDataset
     */

    public static LongIntegerDataset createLongIntegerDataset(File file) {
        return LongIntegerDataset.of(file);
    }

    /**
     * Creates a LongIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongIntegerDataset
     */

    public static LongIntegerDataset createLongIntegerDataset(DataFrame dataframe) {
        return LongIntegerDataset.of(dataframe);
    }

    /**
     * Creates a LongLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongLongDataset
     */

    public static LongLongDataset createLongLongDataset(String url) {
        return LongLongDataset.of(url);
    }

    /**
     * Creates a LongLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongLongDataset
     */

    public static LongLongDataset createLongLongDataset(File file) {
        return LongLongDataset.of(file);
    }

    /**
     * Creates a LongLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongLongDataset
     */

    public static LongLongDataset createLongLongDataset(DataFrame dataframe) {
        return LongLongDataset.of(dataframe);
    }

    /**
     * Creates a LongShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongShortDataset
     */

    public static LongShortDataset createLongShortDataset(String url) {
        return LongShortDataset.of(url);
    }

    /**
     * Creates a LongShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongShortDataset
     */

    public static LongShortDataset createLongShortDataset(File file) {
        return LongShortDataset.of(file);
    }

    /**
     * Creates a LongShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongShortDataset
     */

    public static LongShortDataset createLongShortDataset(DataFrame dataframe) {
        return LongShortDataset.of(dataframe);
    }

    /**
     * Creates a LongStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a LongStringDataset
     */

    public static LongStringDataset createLongStringDataset(String url) {
        return LongStringDataset.of(url);
    }

    /**
     * Creates a LongStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a LongStringDataset
     */

    public static LongStringDataset createLongStringDataset(File file) {
        return LongStringDataset.of(file);
    }

    /**
     * Creates a LongStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a LongStringDataset
     */

    public static LongStringDataset createLongStringDataset(DataFrame dataframe) {
        return LongStringDataset.of(dataframe);
    }

    /**
     * Creates a ShortBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortBooleanDataset
     */

    public static ShortBooleanDataset createShortBooleanDataset(String url) {
        return ShortBooleanDataset.of(url);
    }

    /**
     * Creates a ShortBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortBooleanDataset
     */

    public static ShortBooleanDataset createShortBooleanDataset(File file) {
        return ShortBooleanDataset.of(file);
    }

    /**
     * Creates a ShortBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortBooleanDataset
     */

    public static ShortBooleanDataset createShortBooleanDataset(DataFrame dataframe) {
        return ShortBooleanDataset.of(dataframe);
    }

    /**
     * Creates a ShortByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortByteDataset
     */

    public static ShortByteDataset createShortByteDataset(String url) {
        return ShortByteDataset.of(url);
    }

    /**
     * Creates a ShortByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortByteDataset
     */

    public static ShortByteDataset createShortByteDataset(File file) {
        return ShortByteDataset.of(file);
    }

    /**
     * Creates a ShortByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortByteDataset
     */

    public static ShortByteDataset createShortByteDataset(DataFrame dataframe) {
        return ShortByteDataset.of(dataframe);
    }

    /**
     * Creates a ShortCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortCharacterDataset
     */

    public static ShortCharacterDataset createShortCharacterDataset(String url) {
        return ShortCharacterDataset.of(url);
    }

    /**
     * Creates a ShortCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortCharacterDataset
     */

    public static ShortCharacterDataset createShortCharacterDataset(File file) {
        return ShortCharacterDataset.of(file);
    }

    /**
     * Creates a ShortCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortCharacterDataset
     */

    public static ShortCharacterDataset createShortCharacterDataset(DataFrame dataframe) {
        return ShortCharacterDataset.of(dataframe);
    }

    /**
     * Creates a ShortDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortDoubleDataset
     */

    public static ShortDoubleDataset createShortDoubleDataset(String url) {
        return ShortDoubleDataset.of(url);
    }

    /**
     * Creates a ShortDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortDoubleDataset
     */

    public static ShortDoubleDataset createShortDoubleDataset(File file) {
        return ShortDoubleDataset.of(file);
    }

    /**
     * Creates a ShortDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortDoubleDataset
     */

    public static ShortDoubleDataset createShortDoubleDataset(DataFrame dataframe) {
        return ShortDoubleDataset.of(dataframe);
    }

    /**
     * Creates a ShortFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortFloatDataset
     */

    public static ShortFloatDataset createShortFloatDataset(String url) {
        return ShortFloatDataset.of(url);
    }

    /**
     * Creates a ShortFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortFloatDataset
     */

    public static ShortFloatDataset createShortFloatDataset(File file) {
        return ShortFloatDataset.of(file);
    }

    /**
     * Creates a ShortFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortFloatDataset
     */

    public static ShortFloatDataset createShortFloatDataset(DataFrame dataframe) {
        return ShortFloatDataset.of(dataframe);
    }

    /**
     * Creates a ShortIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortIntegerDataset
     */

    public static ShortIntegerDataset createShortIntegerDataset(String url) {
        return ShortIntegerDataset.of(url);
    }

    /**
     * Creates a ShortIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortIntegerDataset
     */

    public static ShortIntegerDataset createShortIntegerDataset(File file) {
        return ShortIntegerDataset.of(file);
    }

    /**
     * Creates a ShortIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortIntegerDataset
     */

    public static ShortIntegerDataset createShortIntegerDataset(DataFrame dataframe) {
        return ShortIntegerDataset.of(dataframe);
    }

    /**
     * Creates a ShortLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortLongDataset
     */

    public static ShortLongDataset createShortLongDataset(String url) {
        return ShortLongDataset.of(url);
    }

    /**
     * Creates a ShortLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortLongDataset
     */

    public static ShortLongDataset createShortLongDataset(File file) {
        return ShortLongDataset.of(file);
    }

    /**
     * Creates a ShortLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortLongDataset
     */

    public static ShortLongDataset createShortLongDataset(DataFrame dataframe) {
        return ShortLongDataset.of(dataframe);
    }

    /**
     * Creates a ShortShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortShortDataset
     */

    public static ShortShortDataset createShortShortDataset(String url) {
        return ShortShortDataset.of(url);
    }

    /**
     * Creates a ShortShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortShortDataset
     */

    public static ShortShortDataset createShortShortDataset(File file) {
        return ShortShortDataset.of(file);
    }

    /**
     * Creates a ShortShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortShortDataset
     */

    public static ShortShortDataset createShortShortDataset(DataFrame dataframe) {
        return ShortShortDataset.of(dataframe);
    }

    /**
     * Creates a ShortStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a ShortStringDataset
     */

    public static ShortStringDataset createShortStringDataset(String url) {
        return ShortStringDataset.of(url);
    }

    /**
     * Creates a ShortStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a ShortStringDataset
     */

    public static ShortStringDataset createShortStringDataset(File file) {
        return ShortStringDataset.of(file);
    }

    /**
     * Creates a ShortStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a ShortStringDataset
     */

    public static ShortStringDataset createShortStringDataset(DataFrame dataframe) {
        return ShortStringDataset.of(dataframe);
    }

    /**
     * Creates a StringBooleanDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringBooleanDataset
     */

    public static StringBooleanDataset createStringBooleanDataset(String url) {
        return StringBooleanDataset.of(url);
    }

    /**
     * Creates a StringBooleanDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringBooleanDataset
     */

    public static StringBooleanDataset createStringBooleanDataset(File file) {
        return StringBooleanDataset.of(file);
    }

    /**
     * Creates a StringBooleanDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringBooleanDataset
     */

    public static StringBooleanDataset createStringBooleanDataset(DataFrame dataframe) {
        return StringBooleanDataset.of(dataframe);
    }

    /**
     * Creates a StringByteDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringByteDataset
     */

    public static StringByteDataset createStringByteDataset(String url) {
        return StringByteDataset.of(url);
    }

    /**
     * Creates a StringByteDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringByteDataset
     */

    public static StringByteDataset createStringByteDataset(File file) {
        return StringByteDataset.of(file);
    }

    /**
     * Creates a StringByteDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringByteDataset
     */

    public static StringByteDataset createStringByteDataset(DataFrame dataframe) {
        return StringByteDataset.of(dataframe);
    }

    /**
     * Creates a StringCharacterDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringCharacterDataset
     */

    public static StringCharacterDataset createStringCharacterDataset(String url) {
        return StringCharacterDataset.of(url);
    }

    /**
     * Creates a StringCharacterDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringCharacterDataset
     */

    public static StringCharacterDataset createStringCharacterDataset(File file) {
        return StringCharacterDataset.of(file);
    }

    /**
     * Creates a StringCharacterDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringCharacterDataset
     */

    public static StringCharacterDataset createStringCharacterDataset(DataFrame dataframe) {
        return StringCharacterDataset.of(dataframe);
    }

    /**
     * Creates a StringDoubleDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringDoubleDataset
     */

    public static StringDoubleDataset createStringDoubleDataset(String url) {
        return StringDoubleDataset.of(url);
    }

    /**
     * Creates a StringDoubleDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringDoubleDataset
     */

    public static StringDoubleDataset createStringDoubleDataset(File file) {
        return StringDoubleDataset.of(file);
    }

    /**
     * Creates a StringDoubleDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringDoubleDataset
     */

    public static StringDoubleDataset createStringDoubleDataset(DataFrame dataframe) {
        return StringDoubleDataset.of(dataframe);
    }

    /**
     * Creates a StringFloatDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringFloatDataset
     */

    public static StringFloatDataset createStringFloatDataset(String url) {
        return StringFloatDataset.of(url);
    }

    /**
     * Creates a StringFloatDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringFloatDataset
     */

    public static StringFloatDataset createStringFloatDataset(File file) {
        return StringFloatDataset.of(file);
    }

    /**
     * Creates a StringFloatDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringFloatDataset
     */

    public static StringFloatDataset createStringFloatDataset(DataFrame dataframe) {
        return StringFloatDataset.of(dataframe);
    }

    /**
     * Creates a StringIntegerDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringIntegerDataset
     */

    public static StringIntegerDataset createStringIntegerDataset(String url) {
        return StringIntegerDataset.of(url);
    }

    /**
     * Creates a StringIntegerDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringIntegerDataset
     */

    public static StringIntegerDataset createStringIntegerDataset(File file) {
        return StringIntegerDataset.of(file);
    }

    /**
     * Creates a StringIntegerDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringIntegerDataset
     */

    public static StringIntegerDataset createStringIntegerDataset(DataFrame dataframe) {
        return StringIntegerDataset.of(dataframe);
    }

    /**
     * Creates a StringLongDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringLongDataset
     */

    public static StringLongDataset createStringLongDataset(String url) {
        return StringLongDataset.of(url);
    }

    /**
     * Creates a StringLongDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringLongDataset
     */

    public static StringLongDataset createStringLongDataset(File file) {
        return StringLongDataset.of(file);
    }

    /**
     * Creates a StringLongDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringLongDataset
     */

    public static StringLongDataset createStringLongDataset(DataFrame dataframe) {
        return StringLongDataset.of(dataframe);
    }

    /**
     * Creates a StringShortDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringShortDataset
     */

    public static StringShortDataset createStringShortDataset(String url) {
        return StringShortDataset.of(url);
    }

    /**
     * Creates a StringShortDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringShortDataset
     */

    public static StringShortDataset createStringShortDataset(File file) {
        return StringShortDataset.of(file);
    }

    /**
     * Creates a StringShortDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringShortDataset
     */

    public static StringShortDataset createStringShortDataset(DataFrame dataframe) {
        return StringShortDataset.of(dataframe);
    }

    /**
     * Creates a StringStringDataset from a dataset url
     *
     * @param url the dataset url
     * @return a StringStringDataset
     */

    public static StringStringDataset createStringStringDataset(String url) {
        return StringStringDataset.of(url);
    }

    /**
     * Creates a StringStringDataset from a dataset file
     *
     * @param file the dataset file
     * @return a StringStringDataset
     */

    public static StringStringDataset createStringStringDataset(File file) {
        return StringStringDataset.of(file);
    }

    /**
     * Creates a StringStringDataset from a dataframe
     *
     * @param dataframe the dataset dataframe
     * @return a StringStringDataset
     */

    public static StringStringDataset createStringStringDataset(DataFrame dataframe) {
        return StringStringDataset.of(dataframe);
    }
}


