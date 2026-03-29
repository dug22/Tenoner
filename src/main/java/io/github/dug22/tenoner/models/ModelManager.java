package io.github.dug22.tenoner.models;

import com.google.gson.*;

import java.io.*;
import java.lang.reflect.Type;

public class ModelManager {


    private final Gson gson;


    public ModelManager() {
        this.gson = new GsonBuilder()
                .registerTypeHierarchyAdapter(IModel.class, new IModelAdapter())
                .setPrettyPrinting()
                .create();
    }

    public void saveModel(IModel<?, ?> model, String filePath) {

        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(model, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public IModel<?, ?> loadModel(String filePath) {
        try (Reader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, IModel.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class IModelAdapter implements JsonSerializer<IModel<?, ?>>, JsonDeserializer<IModel<?, ?>> {

        @Override
        public JsonElement serialize(IModel<?, ?> model, Type sourceType, JsonSerializationContext context) {
            Gson internalGson = new Gson();
            JsonObject wrapper = new JsonObject();
            wrapper.addProperty("type", model.getClass().getName());
            wrapper.add("properties", internalGson.toJsonTree(model));
            return wrapper;
        }

        @Override
        public IModel<?, ?> deserialize(JsonElement json, Type typeType, JsonDeserializationContext context) {
            JsonObject wrapper = json.getAsJsonObject();
            JsonElement typeElement = wrapper.get("type");
            JsonElement propertiesElement = wrapper.get("properties");
            try {
                return (IModel<?, ?>) new Gson().fromJson(propertiesElement, Class.forName(typeElement.getAsString()));
            } catch (ClassNotFoundException e) {
                System.err.println("Class not found: " + typeElement.getAsString() + "\n" + e);
            }
            return null;
        }
    }
}