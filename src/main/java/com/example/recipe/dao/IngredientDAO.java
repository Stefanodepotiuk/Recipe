package com.example.recipe.dao;

import com.example.recipe.models.IngredientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDAO extends JpaRepository<IngredientModel,Integer> {
}
