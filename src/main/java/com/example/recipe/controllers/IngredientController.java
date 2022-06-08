package com.example.recipe.controllers;

import com.example.recipe.dao.IngredientDAO;
import com.example.recipe.models.IngredientModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
@AllArgsConstructor
public class IngredientController {
    private IngredientDAO ingredientDAO;

    @GetMapping
    public List<IngredientModel> getAll(){
        return ingredientDAO.findAll();
    }
}
