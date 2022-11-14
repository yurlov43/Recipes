package com.example.recipes

class FakeFoodRepository {
    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                title = R.string.Recipe_title_Omelet_classic,
                category = CategoriesMeals.SECOND_DISH,
                ingredients =  listOf(Ingredient.EGG),
                cookingTime = 8,
                numberOfCalories = 450,
                stepsForCooking = listOf(
                    R.string.Recipe_Omelet_classic_step_1,
                    R.string.Recipe_Omelet_classic_step_2,
                    R.string.Recipe_Omelet_classic_step_3,
                    R.string.Recipe_Omelet_classic_step_4,
                    R.string.Recipe_Omelet_classic_step_5,
                    R.string.Recipe_Omelet_classic_step_6,
                    R.string.Recipe_Omelet_classic_step_7,
                    R.string.Recipe_Omelet_classic_step_8
                ),
                isFavorite = false,
                rating = 2,
                linkToImage = R.drawable.asian_glazed_chicken_thighs,
                numberOfServings = 1
            ),
            Recipe(
                title = R.string.Recipe_title_Omelet_classic,
                category = CategoriesMeals.DESSERT,
                ingredients =  listOf(Ingredient.EGG),
                cookingTime = 113,
                numberOfCalories = 50,
                stepsForCooking = listOf(
                    R.string.Recipe_Omelet_classic_step_1,
                    R.string.Recipe_Omelet_classic_step_2,
                    R.string.Recipe_Omelet_classic_step_3,
                    R.string.Recipe_Omelet_classic_step_4,
                    R.string.Recipe_Omelet_classic_step_5,
                    R.string.Recipe_Omelet_classic_step_6,
                    R.string.Recipe_Omelet_classic_step_7,
                    R.string.Recipe_Omelet_classic_step_8
                ),
                isFavorite = false,
                rating = 4,
                linkToImage = R.drawable.asian_glazed_chicken_thighs,
                numberOfServings = 1
            ),
            Recipe(
                title = R.string.Recipe_title_Omelet_classic,
                category = CategoriesMeals.DRINK,
                ingredients =  listOf(Ingredient.EGG),
                cookingTime = 25,
                numberOfCalories = 1050,
                stepsForCooking = listOf(
                    R.string.Recipe_Omelet_classic_step_1,
                    R.string.Recipe_Omelet_classic_step_2,
                    R.string.Recipe_Omelet_classic_step_3,
                    R.string.Recipe_Omelet_classic_step_4,
                    R.string.Recipe_Omelet_classic_step_5,
                    R.string.Recipe_Omelet_classic_step_6,
                    R.string.Recipe_Omelet_classic_step_7,
                    R.string.Recipe_Omelet_classic_step_8
                ),
                isFavorite = false,
                rating = 3,
                linkToImage = R.drawable.asian_glazed_chicken_thighs,
                numberOfServings = 1
            ),
            Recipe(
                title = R.string.Recipe_title_Omelet_classic,
                category = CategoriesMeals.FIRST_DISH,
                ingredients =  listOf(Ingredient.EGG),
                cookingTime = 58,
                numberOfCalories = 550,
                stepsForCooking = listOf(
                    R.string.Recipe_Omelet_classic_step_1,
                    R.string.Recipe_Omelet_classic_step_2,
                    R.string.Recipe_Omelet_classic_step_3,
                    R.string.Recipe_Omelet_classic_step_4,
                    R.string.Recipe_Omelet_classic_step_5,
                    R.string.Recipe_Omelet_classic_step_6,
                    R.string.Recipe_Omelet_classic_step_7,
                    R.string.Recipe_Omelet_classic_step_8
                ),
                isFavorite = false,
                rating = 1,
                linkToImage = R.drawable.asian_glazed_chicken_thighs,
                numberOfServings = 1
            ),
            Recipe(
                title = R.string.Recipe_title_Omelet_classic,
                category = CategoriesMeals.SAUCE,
                ingredients =  listOf(Ingredient.EGG),
                cookingTime = 94,
                numberOfCalories = 150,
                stepsForCooking = listOf(
                    R.string.Recipe_Omelet_classic_step_1,
                    R.string.Recipe_Omelet_classic_step_2,
                    R.string.Recipe_Omelet_classic_step_3,
                    R.string.Recipe_Omelet_classic_step_4,
                    R.string.Recipe_Omelet_classic_step_5,
                    R.string.Recipe_Omelet_classic_step_6,
                    R.string.Recipe_Omelet_classic_step_7,
                    R.string.Recipe_Omelet_classic_step_8
                ),
                isFavorite = false,
                rating = 5,
                linkToImage = R.drawable.asian_glazed_chicken_thighs,
                numberOfServings = 1
            )
        )
    }

    fun sortRecipes(recipes: List<Recipe>, ascendingOrder: Boolean): List<Recipe> {
        return if (ascendingOrder) recipes.sortedWith(compareBy { it.rating }) else recipes.sortedWith(compareByDescending { it.rating })
    }

    fun filterByCategory(recipes: List<Recipe>, category: CategoriesMeals): List<Recipe> {
        return recipes.filter { it.category == category }.toList()
    }

    fun filterByCalories(recipes: List<Recipe>, startingNumberOfCalories: Int): List<Recipe> {
        return recipes.filter { it.numberOfCalories >= startingNumberOfCalories }.toList()
    }

    fun filterByCookingTime(recipes: List<Recipe>, startTime: Int, endTime: Int): List<Recipe> {
        return recipes.filter { it.cookingTime in startTime..endTime }.toList()
    }
}