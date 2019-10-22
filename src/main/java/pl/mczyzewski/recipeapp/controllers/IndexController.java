package pl.mczyzewski.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mczyzewski.recipeapp.domain.Category;
import pl.mczyzewski.recipeapp.domain.UnitOfMeasure;
import pl.mczyzewski.recipeapp.reposetories.CategoryRepository;
import pl.mczyzewski.recipeapp.reposetories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Cat id is : " + categoryOptional.get().getId());
        System.out.println("UOM Id is : " + unitOfMeasureOptional.get().getId());

      return "index";
    }

}
