package com.example.fastfoodapp.ui.theme.Activites

import com.example.fastfoodapp.FoodCategory
import com.example.fastfoodapp.R

data class FoodsInCategories (
    val name : String,
    val image : Int,
    val category : FoodCategory,
)

val allFoods = mutableListOf(
    // Рыбы
    FoodsInCategories(
        name = "Рыба",
        image = R.drawable.fish,
        category = FoodCategory.Fish
    ),
    // Пиццы
    FoodsInCategories(
        name = "Пицца",
        image = R.drawable.pizza,
        category = FoodCategory.Pizza
    ),
    //Бургеры
    FoodsInCategories(
        name = "Бургер",
        image = R.drawable.burger1,
        category = FoodCategory.Burger
    ),
    //Десерты
    FoodsInCategories(
        name = "Десерт",
        image = R.drawable.dissert,
        category = FoodCategory.Dessert
    ),
    //Супы
    FoodsInCategories(
        name = "Суп",
        image = R.drawable.soup,
        category = FoodCategory.Soup
    ),
    //Салаты
    FoodsInCategories(
        name = "Салат",
        image = R.drawable.salad,
        category = FoodCategory.Salad
    ),
)



