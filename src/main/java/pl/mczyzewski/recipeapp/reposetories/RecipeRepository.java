package pl.mczyzewski.recipeapp.reposetories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
