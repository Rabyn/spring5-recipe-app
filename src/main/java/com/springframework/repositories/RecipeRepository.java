package com.springframework.repositories;

/*
 * Created by Rabindra on 8/19/18
 */

import com.springframework.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
