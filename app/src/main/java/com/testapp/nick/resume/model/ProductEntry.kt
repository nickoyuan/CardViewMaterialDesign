package com.testapp.nick.resume.model

class ProductEntry {


    var title: String? = null
    var resId: Int? = null
    var description: String? = null

    companion object fun createProductEntry(title: String?, description: String?, resId: Int?): ProductEntry {
        val creativeProduct = ProductEntry()
        creativeProduct.title = title
        creativeProduct.description = description
        creativeProduct.resId = resId
        return creativeProduct
    }


}