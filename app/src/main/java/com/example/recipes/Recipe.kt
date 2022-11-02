package com.example.recipes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes
    val title: Int,
    val category: CategoriesMeals,
    val ingredients: List<Ingredient>,
    val cookingTime: Int,
    val numberOfCalories: Int,
    val stepsForCooking: List<Int>,
    val isFavorite: Boolean,
    var rating: Int,
    @DrawableRes
    var linkToImage: Int,
    val numberOfServings: Int)
