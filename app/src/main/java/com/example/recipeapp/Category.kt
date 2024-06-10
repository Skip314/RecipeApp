package com.example.recipeapp

class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val quality: Int,
    val ingredients: List<Ingredient>,
)

class Ingredient(
    val quality: Float,
    val unitOfMeasure: String,
    val description: String,
)