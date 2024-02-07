package com.yesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yesh.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
