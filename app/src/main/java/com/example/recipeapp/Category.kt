package com.example.recipeapp

class Category(
    val name: String,
    val icon: String,
    val destination: String,
    val recipe: List<Recipe>,
)

class Recipe(
    val name: String,
    val quality: Int,
    val ingredients: List<Ingredient>,
    val cooking: String
)

class Ingredient(
    val name: String,
    val quality: Int
)
