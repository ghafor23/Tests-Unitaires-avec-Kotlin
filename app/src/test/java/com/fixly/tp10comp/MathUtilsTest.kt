package com.fixly.tp10comp
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MathUtilsTest {

    private val math = MathUtils()

    @Test
    fun testAdd() {
        assertEquals(10, math.add(5, 5))
    }

    @Test
    fun testSubtract() {
        assertEquals(5, math.subtract(10, 5))
    }

    @Test
    fun testDivide() {
        assertEquals(2.0, math.divide(10, 5))
    }

    @Test
    fun testDivideByZero() {
        assertThrows(IllegalArgumentException::class.java) {
            math.divide(10, 0)
        }
    }

    @Test
    fun testIsEven() {
        assertTrue(math.isEven(4))
        assertFalse(math.isEven(5))
    }
}