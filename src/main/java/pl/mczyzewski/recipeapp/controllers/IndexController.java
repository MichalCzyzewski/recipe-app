package pl.mczyzewski.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mczyzewski.recipeapp.domain.Category;
import pl.mczyzewski.recipeapp.domain.UnitOfMeasure;
import pl.mczyzewski.recipeapp.reposetories.CategoryRepository;
import pl.mczyzewski.recipeapp.reposetories.UnitOfMeasureRepository;
import pl.mczyzewski.recipeapp.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){

        model.addAttribute("recipe",recipeService.getRecipe());
      return "index";
    }

}
