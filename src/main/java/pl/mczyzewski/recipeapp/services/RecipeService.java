package pl.mczyzewski.recipeapp.services;

import pl.mczyzewski.recipeapp.commands.RecipeCommand;
import pl.mczyzewski.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
