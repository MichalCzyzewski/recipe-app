package pl.mczyzewski.recipeapp.reposetories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
