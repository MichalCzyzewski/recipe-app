package pl.mczyzewski.recipeapp.services;

import pl.mczyzewski.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();

}
