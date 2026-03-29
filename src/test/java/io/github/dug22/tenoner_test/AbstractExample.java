package io.github.dug22.tenoner_test;

public abstract class AbstractExample {

    protected abstract void defineDataframe();

    protected abstract void defineDataset();

    protected abstract void defineModel();

    protected abstract void trainAndEvaluateModel();

    protected abstract void testPredictions();

    protected static void out(Object object){
        System.out.println(object);
    }

    protected static void out(){
        System.out.println();
    }
}
