
package com.fixly.tp10comp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PasswordValidatorTest {

    private val validator = PasswordValidator()

    @Test
    fun testMotDePasseValide() {
        assertTrue(validator.validerMotDePasse("Bonjour123"))
    }

    @Test
    fun testSansMajuscule() {
        assertFalse(validator.validerMotDePasse("bonjour123"))
    }

    @Test
    fun testSansChiffre() {
        assertFalse(validator.validerMotDePasse("BonjourABC"))
    }

    @Test
    fun testMotDePasseCourt() {
        assertFalse(validator.validerMotDePasse("Bon123"))
    }
}
