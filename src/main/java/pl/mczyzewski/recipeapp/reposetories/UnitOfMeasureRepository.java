package pl.mczyzewski.recipeapp.reposetories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
