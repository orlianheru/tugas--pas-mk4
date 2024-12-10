package com.rasya.tugaskelompok

import java.io.Serializable

data class FoodItem(
    val imageResource: Int, // Resource ID of the food image
    val title: String,
    val calories: Int,
    val description: String
) : Serializable