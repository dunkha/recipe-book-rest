package com.dunkha.projects.recipe.book;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Set;

@Component("recipesJSONParser")
public class RecipesJSONParser {
    private final static String FILEPATH = "src/main/resources/recipes.json";
    private final static Type RECIPE_TYPE = new TypeToken<Set<Recipe>>() {}.getType();

    public Set<Recipe> parseRecipes() {
        Gson gson = new Gson();

        try {
            JsonReader reader = new JsonReader(new FileReader(FILEPATH));

            return gson.fromJson(reader, RECIPE_TYPE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return  null;
    }
}
