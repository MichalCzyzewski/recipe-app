package pl.mczyzewski.recipeapp.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CategoryCommands {

    private Long id;
    private String description;

}
