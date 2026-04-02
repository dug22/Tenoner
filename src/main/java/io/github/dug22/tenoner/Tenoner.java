package io.github.dug22.tenoner;

import io.github.dug22.carpentry.DataFrame;
import io.github.dug22.tenoner.data.DatasetFactory.*;
import io.github.dug22.tenoner.data.encoder.FeatureEncoder;
import io.github.dug22.tenoner.data.encoder.LabelEncoder;
import io.github.dug22.tenoner.math.DataNormalizer;
import io.github.dug22.tenoner.models.ModelManager;
import io.github.dug22.tenoner.models.impl.*;

import java.io.File;

public class Tenoner {

    /**
     * Gets a featureEncoder instance
     *
     * @return a new FeatureEncoder instance
     */
    public static FeatureEncoder featureEncoder() {
        return FeatureEncoder.getInstance();
    }

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
}


