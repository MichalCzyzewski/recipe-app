package pl.mczyzewski.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class CategoryTest {

    Category category;

    @Before
    private void setUp(){
        category = new Category();
    }

    @Test
    public void getDescription() {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    public void getRecipes() {
    }

    @Test
    public void setId() {
    }
}
