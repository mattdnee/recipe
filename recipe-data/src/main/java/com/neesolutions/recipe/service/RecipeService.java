package com.neesolutions.recipe.service;

import com.neesolutions.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
}
