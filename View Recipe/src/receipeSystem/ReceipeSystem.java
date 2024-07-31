package receipeSystem;

import adt.*;
import boundary.*;
import control.*;
import entity.*;
import dao.*;


// This is the driver class
public class ReceipeSystem {

    public static void main(String[] args) {
        ListInterface<Recipe> recipes = new ArrayList<Recipe> (30);
        recipes = RecipeDao.initRecipe();
        
        RecipeControl recipeControl = new RecipeControl(recipes);
        RecipeBoundary recipeBoundary = new RecipeBoundary();
        recipeBoundary.printRecipes(recipes);
        
    }
    
}
