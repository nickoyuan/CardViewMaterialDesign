package com.testapp.nick.resume.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.testapp.nick.resume.R
import com.testapp.nick.resume.model.ProductEntry
import com.testapp.nick.resume.view.ProductCardViewHolder

/**
 * RecyclerView.Adapter implementations should subclass ViewHolder
 * and add fields for caching potentially expensive findViewById(int) results.
 */
class ProductCardRecyclerViewAdapter(
    private val productList: List<ProductEntry>
) : RecyclerView.Adapter<ProductCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.sh_product_card, parent, false)
        return ProductCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        if (position < productList.size) {
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.description
            if(product.resId != null || product.resId != -1) {
                holder.productImage.setImageResource(product.resId!!)
            }
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }


}