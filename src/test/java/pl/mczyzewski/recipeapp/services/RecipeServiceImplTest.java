package pl.mczyzewski.recipeapp.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.mczyzewski.recipeapp.domain.Recipe;
import pl.mczyzewski.recipeapp.reposetories.RecipeRepository;

import java.util.Set;

import static org.junit.Assert.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipe() {

        Set<Recipe> recipes = recipeService.getRecipe();

        assertEquals(recipes.size(),0);
    }
}