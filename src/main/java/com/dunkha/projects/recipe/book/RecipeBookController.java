package com.dunkha.projects.recipe.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RecipeBookController {

    @Autowired
    private RecipeRepository repository;

    @Autowired
    private RecipesJSONParser recipesJSONParser;

    @RequestMapping(value = "/recipes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Recipe> getRecipes() {
        return repository.findAll();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Recipe> genereateTestRecipes() {
        repository.deleteAll();

        return repository.insert(recipesJSONParser.parseRecipes());
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteAll() {
        repository.deleteAll();
    }

    @RequestMapping(value ="/recipe/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Optional<Recipe> getRecipe(@PathVariable("id") String id) {
        return repository.findById(id);
    }

    @PostMapping(value="/createRecipe", consumes = "application/json", produces = "application/json")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return repository.insert(recipe);
    }

    @PostMapping(value="/updateRecipe", consumes = "application/json", produces = "application/json")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return repository.save(recipe);
    }
}
