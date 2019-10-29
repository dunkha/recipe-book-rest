package com.dunkha.projects.recipe.book;

import org.springframework.data.annotation.Id;

import java.util.Set;

public class Recipe {
    @Id
    private String id;
    private String name;
    private String description;
    private Set<Ingredient> ingredients;
    private Set<WorkStep> workSteps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Set<WorkStep> getWorkSteps() {
        return workSteps;
    }

    public void setWorkSteps(Set<WorkStep> workSteps) {
        this.workSteps = workSteps;
    }


}
