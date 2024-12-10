package com.rasya.tugaskelompok.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rasya.tugaskelompok.FoodItem
import com.rasya.tugaskelompok.R


class AdapterFood(private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<AdapterFood.FoodItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val cardView = LayoutInflater.from(parent.context).inflate(
            R.layout.card_add_menu,
            parent, false
        ) as CardView
        return FoodItemViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.titleTextView.text = foodItem.title
        holder.calorieTextView.text = "50g * ${foodItem.calories} cal"
    }

    override fun getItemCount(): Int {
        return foodItems.size
    }

    class FoodItemViewHolder(itemView: CardView) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.food_title)
        val calorieTextView: TextView = itemView.findViewById(R.id.calorie)
    }
}