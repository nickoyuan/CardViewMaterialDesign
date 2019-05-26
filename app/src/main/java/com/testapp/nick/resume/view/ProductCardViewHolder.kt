package com.testapp.nick.resume.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.testapp.nick.resume.R


/**
 * A ViewHolder describes an item view and metadata about its place within the RecyclerView
 *  This class stores the views that affect our card layout, so we can modify them later.
 */
class ProductCardViewHolder(itemView: View) //TODO: Find and store views from itemView
    : RecyclerView.ViewHolder(itemView) {

    var productImage: ImageView = itemView.findViewById(R.id.product_image)
    var productTitle: TextView = itemView.findViewById(R.id.product_title)
    var productPrice: TextView = itemView.findViewById(R.id.product_price)
}