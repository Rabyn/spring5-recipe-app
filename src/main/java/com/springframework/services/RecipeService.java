package com.springframework.services;

/*
 * Created by Rabindra on 8/19/18
 */

import com.springframework.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
