package com.springframework.repositories;

/*
 * Created by Rabindra on 8/19/18
 */

import com.springframework.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
