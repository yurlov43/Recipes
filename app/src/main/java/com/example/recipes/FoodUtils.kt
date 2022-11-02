package com.example.recipes

class FoodUtils {
    fun resolveFoodIngredient(ingredient: Ingredient): Int {
        return when(ingredient) {
            Ingredient.SUGAR -> R.drawable.ingredients_powdered_sugar
            Ingredient.CHEESE -> R.drawable.ingredients_cheese
            Ingredient.GRAPE -> R.drawable.ingredients_grape
            Ingredient.STRAWBERRY -> R.drawable.ingredients_strawberry
            Ingredient.EGG -> R.drawable.ingredients_egg
            Ingredient.WATER -> R.drawable.ingredients_water
        }
    }
}