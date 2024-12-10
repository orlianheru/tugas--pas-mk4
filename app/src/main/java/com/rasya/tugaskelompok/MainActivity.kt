package com.rasya.tugaskelompok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import com.rasya.tugaskelompok.databinding.ActivityMainBinding
import com.rasya.tugaskelompok.fragment.AddFoodFragment
import com.rasya.tugaskelompok.fragment.HomeFragment
import com.rasya.tugaskelompok.fragment.HydrateFragment
import com.rasya.tugaskelompok.fragment.MenuFragment
import com.rasya.tugaskelompok.fragment.ProfileFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set initial fragment
        replaceFragment(HomeFragment())

        // Remove BottomNavigationView background
        binding.bottomNavigationView.background = null

        // BottomNavigationView item selection listener
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            val fragment = when (item.itemId) {
                R.id.home -> HomeFragment()
                R.id.addHydrate -> HydrateFragment()
                R.id.MenuBook -> MenuFragment()
                R.id.profile -> ProfileFragment()
                else -> null
            }
            fragment?.let { replaceFragment(it) }
            true
        }
        binding.floatingActionButton.setOnClickListener {
            replaceFragment(AddFoodFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}
