package com.testapp.nick.resume.view

import android.os.Bundle
import android.view.*
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testapp.nick.resume.R
import com.testapp.nick.resume.model.ProductEntry
import com.testapp.nick.resume.view.adapter.ProductCardRecyclerViewAdapter
import kotlinx.android.synthetic.main.shr_product_grid_fragment.view.*

class ProductGridFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment with the ProductGrid theme
        val view = inflater.inflate(R.layout.shr_product_grid_fragment, container, false)
        setUpRecyclerView(view)
        return view
    }

    private fun setUpRecyclerView(view: View) {
        // Set up the RecyclerView
        view.recycler_view.setHasFixedSize(true)
        view.recycler_view.layoutManager = GridLayoutManager(
            context,
            2,
            RecyclerView.VERTICAL,
            false
        )

        var productList: ArrayList<ProductEntry> = ArrayList()
        productList.add(ProductEntry().createProductEntry(
            "创新", "加创新的简历", R.drawable.resume_creative
        ))
        productList.add(ProductEntry().createProductEntry(
            "简单", "加简单的简历", R.drawable.resume_simple
        ))
        productList.add(ProductEntry().createProductEntry(
            "专业", "加专业的简历", R.drawable.resume_professional
        ))
        productList.add(ProductEntry().createProductEntry(
            "大学", "加大学的简历", R.drawable.resume_collage
        ))
       view.recycler_view.adapter = ProductCardRecyclerViewAdapter(
           productList
        )

        val largePadding = resources.getDimensionPixelSize(R.dimen.shr_product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.shr_product_grid_spacing_small)
        //view.recycler_view.addItemDecoration(ProductGridItemDecoration(largePadding, smallPadding))
    }

}