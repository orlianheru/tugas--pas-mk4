package com.rasya.tugaskelompok.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rasya.tugaskelompok.FoodItem
import com.rasya.tugaskelompok.R

class AddFoodFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodItems: List<FoodItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a list of food items (replace with your actual data)
        foodItems = listOf(
            FoodItem(R.drawable.cheesecake, "Cheesecake", 244, "Delicious creamy cheesecake"),
            // Add more food items here
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        // Initialize the RecyclerView
        recyclerView = view.findViewById(R.id.RecyclerViewMenu)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Initialize and set the adapter with proper import
        val adapter = AdapterFood(foodItems) // Import AdapterFood from your package
        recyclerView.adapter = adapter

        return view
    }
}