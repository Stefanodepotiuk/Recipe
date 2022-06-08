package com.example.recipe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class IngredientModel {
    @Id
    private int id;
    private String type;
    private String name;
    private byte weight;
    private int calories;
    private float total_protein;
}
