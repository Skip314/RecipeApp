package com.example.recipeapp

class Category(
    val id: String,
    val title: String,
    val description: String,
    val imageUrl: String,
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
