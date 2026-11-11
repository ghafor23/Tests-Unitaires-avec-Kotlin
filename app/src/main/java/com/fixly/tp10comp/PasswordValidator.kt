
package com.fixly.tp10comp

class PasswordValidator {

    fun validerMotDePasse(password: String): Boolean {

        val longueurValide = password.length >= 8

        val contientMajuscule = password.any {
            it.isUpperCase()
        }

        val contientChiffre = password.any {
            it.isDigit()
        }

        return longueurValide && contientMajuscule && contientChiffre
    }
}
