package com.example.fastfoodapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf

sealed interface FoodCategory {
    object Pizza : FoodCategory
    object Burger : FoodCategory
    object Salad : FoodCategory
    object Soup : FoodCategory
    object Dessert : FoodCategory
    object Fish : FoodCategory
}


data class Food (
    val name: String,
    val description: String,
    val image: Int,
    val category: FoodCategory
)


val foodList = mutableStateListOf(
    Food(
        name = "Пиццы",
        description = "Пицца на любой вкус и цвет. Лучшая подборка для тебя",
        image = R.drawable.pizza,
        category = FoodCategory.Pizza
    ),
    Food(
        name = "Бургеры",
        description = "Рецепты всех популярных видов бургеров",
        image = R.drawable.burger1,
        category = FoodCategory.Burger
    ),
    Food(
        name = "Салаты",
        description = "Хрустящий калейдоскоп под соусом вдохновения",
        image = R.drawable.salad,
        category = FoodCategory.Salad
    ),
    Food(
        name = "Супы",
        description = "От классики до экзотики: мир в одной тарелке",
        image = R.drawable.soup,
        category = FoodCategory.Soup
    ),
    Food(
        name = "Десерты",
        description = "Самые вкусные рецепты десертов специально для вас",
        image = R.drawable.dissert,
        category = FoodCategory.Dessert
    ),
    Food(
        name = "Рыбы",
        description = "Печеная, жареная, сушеная, любая рыба на твой вкус",
        image = R.drawable.fish,
        category = FoodCategory.Fish,
    ))