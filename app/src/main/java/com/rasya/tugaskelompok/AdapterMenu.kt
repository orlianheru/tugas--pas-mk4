package com.rasya.tugaskelompok

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterMenu(private val context: Context, private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<AdapterMenu.FoodItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_menu, parent, false)
        return FoodItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.imageView.setImageResource(foodItem.imageResource)
        holder.titleTextView.text = foodItem.title
        holder.caloriesTextView.text = "${foodItem.calories} Cal"
        holder.descriptionTextView.text = foodItem.description

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("food_item", foodItem)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return foodItems.size
    }

    class FoodItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val titleTextView: TextView = itemView.findViewById(R.id.title_text)
        val caloriesTextView: TextView = itemView.findViewById(R.id.calories_text)
        val descriptionTextView: TextView = itemView.findViewById(R.id.description_text)
    }
}
