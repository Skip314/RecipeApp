package com.example.recipeapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.databinding.ActivityMainBinding
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding
            ?: throw IllegalStateException("Binding for ActivityMainB must not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportFragmentManager.commit {
            add<CategoriesListFragment>(R.id.mainContainer)
            setReorderingAllowed(true)
        }

        binding.btnFavorite.setOnClickListener {
            supportFragmentManager.commit {
                replace<FavoritesFragment>(R.id.mainContainer)
                setReorderingAllowed(true)
            }
        }

        binding.btnCategory.setOnClickListener {
            supportFragmentManager.commit {
                replace<CategoriesListFragment>(R.id.mainContainer)
                setReorderingAllowed(true)
            }
        }
    }
}