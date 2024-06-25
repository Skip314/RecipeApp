package com.example.recipeapp

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriesListAdapter(private val dataSet: List<Category>) :
    RecyclerView.Adapter<CategoriesListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.categoryImage)
        val categoryName: TextView = view.findViewById(R.id.categoryName)
        val categoryDescription: TextView = view.findViewById(R.id.categoryDescription)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val inflater = LayoutInflater.from(viewGroup.context)
        val view = inflater.inflate(R.layout.item_category, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val category: Category = dataSet[position]
        viewHolder.categoryName.text = category.title
        viewHolder.categoryDescription.text = category.description

        val drawable =
            try {
                Drawable.createFromStream(
                    viewHolder.itemView.context.assets.open(category.imageUrl), null
                )
            } catch (e: Exception) {
                Log.d("!!!", "Image not found: ${category.imageUrl}")
                null
            }
        viewHolder.imageView.setImageDrawable(drawable)
    }

    override fun getItemCount() = dataSet.size
}
