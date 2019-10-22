package pl.mczyzewski.recipeapp.reposetories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.recipeapp.domain.Category;

import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription (String description);

}
