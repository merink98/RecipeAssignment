package com.infosys.infyshop.product.service;

import com.infosys.infyshop.product.dto.RecipeDTO;
import com.infosys.infyshop.product.exception.RecipeException;

public interface RecipeService {

	String createRecipe(RecipeDTO createRecipeDTO) throws RecipeException;	
}
