
package com.fixly.tp10comp

class ProductManager {

    private val products = mutableMapOf<String, Double>()

    fun addProduct(name: String, price: Double) {

        require(price > 0) {
            "Le prix doit être positif"
        }

        products[name] = price
    }

    fun removeProduct(name: String) {
        products.remove(name)
    }

    fun getProductPrice(name: String): Double? {
        return products[name]
    }

    fun calculateTotalPrice(): Double {
        return products.values.sum()
    }
}
