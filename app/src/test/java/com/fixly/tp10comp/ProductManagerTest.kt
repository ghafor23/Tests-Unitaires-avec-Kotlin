
package com.fixly.tp10comp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ProductManagerTest {

    @Test
    fun testAddProduct() {
        val manager = ProductManager()

        manager.addProduct("PC", 5000.0)

        assertEquals(5000.0, manager.getProductPrice("PC"))
    }

    @Test
    fun testPrixNegatif() {
        val manager = ProductManager()

        assertThrows(IllegalArgumentException::class.java) {
            manager.addProduct("PC", -500.0)
        }
    }

    @Test
    fun testRemoveProduct() {
        val manager = ProductManager()

        manager.addProduct("Telephone", 2000.0)
        manager.removeProduct("Telephone")

        assertNull(manager.getProductPrice("Telephone"))
    }

    @Test
    fun testGetProductPrice() {
        val manager = ProductManager()

        manager.addProduct("PC", 5000.0)

        assertEquals(5000.0, manager.getProductPrice("PC"))
    }

    @Test
    fun testCalculateTotalPrice() {
        val manager = ProductManager()

        manager.addProduct("PC", 5000.0)
        manager.addProduct("Telephone", 2000.0)
        manager.addProduct("Souris", 100.0)

        assertEquals(7100.0, manager.calculateTotalPrice())
    }
}
