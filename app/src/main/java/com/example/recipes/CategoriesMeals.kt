package com.example.recipes

import androidx.annotation.StringRes

enum class CategoriesMeals(@StringRes val nameCategories: Int) {
    SAUCE(R.string.Categories_meals_sauce),
    DRINK(R.string.Categories_meals_drink),
    DESSERT(R.string.Categories_meals_dessert),
    FIRST_DISH(R.string.Categories_meals_first_dish),
    SECOND_DISH(R.string.Categories_meals_second_dish)
}