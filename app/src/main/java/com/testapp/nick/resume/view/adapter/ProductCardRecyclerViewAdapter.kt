package com.testapp.nick.resume.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.testapp.nick.resume.R
import com.testapp.nick.resume.view.ProductCardViewHolder

/**
 * RecyclerView.Adapter implementations should subclass ViewHolder
 * and add fields for caching potentially expensive findViewById(int) results.
 */
class ProductCardRecyclerViewAdapter(private val productList: List<ProductEntry>) :
    RecyclerView.Adapter<ProductCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return ProductCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        if (position < productList.size) {
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.price
            ImageRequester.setImageFromUrl(holder.productImage, product.url)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }


}