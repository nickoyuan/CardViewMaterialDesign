package com.testapp.nick.resume.model

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ProductEntryTest {
    var productObj : ProductEntry? = null
    @Before
    fun setUp() {
        productObj  = ProductEntry()
    }

    @After
    fun tearDown() {
        productObj = null
    }

    @Test
    fun addProductEntry() {
        productObj = productObj!!.createProductEntry("TitleTest", "DescriptTest", 10)
        assertEquals(productObj!!.title, "TitleTest")
        assertEquals(productObj!!.description, "DescriptTest")
        assertEquals(productObj!!.resId, 10)
    }
}