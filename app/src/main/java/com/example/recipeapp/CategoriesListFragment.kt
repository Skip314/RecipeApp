package com.example.recipeapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.Fragment
import com.example.recipeapp.databinding.ActivityMainBinding
import java.lang.IllegalStateException

class CategoriesListFragment : Fragment(R.layout.fragment_list_categories) {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for ActivityMainB must not be null")

    fun onCreateView(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
    }
}