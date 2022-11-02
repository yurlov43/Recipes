package com.example.recipes

import androidx.annotation.StringRes

enum class Ingredient(@StringRes val nameIngredient: Int) {
    SUGAR(R.string.ingredients_sugar),
    WATER(R.string.ingredients_water),
    EGG(R.string.ingredients_egg),
    CHEESE(R.string.ingredients_cheese),
    GRAPE(R.string.ingredients_grape),
    STRAWBERRY(R.string.ingredients_strawberry)
}