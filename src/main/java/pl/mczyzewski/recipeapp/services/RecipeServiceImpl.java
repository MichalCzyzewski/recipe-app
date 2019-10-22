package pl.mczyzewski.recipeapp.services;

import org.springframework.stereotype.Service;
import pl.mczyzewski.recipeapp.domain.Recipe;
import pl.mczyzewski.recipeapp.reposetories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipe() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
