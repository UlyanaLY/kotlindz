package org.example

//Some code from the internet
class PhoneNormalizer {

    fun normalize(phone: String): String {
        val digits = phone.filter { it.isDigit() }

        require(digits.length == 11) { "Phone must contain 11 digits" }

        return when {
            digits.startsWith("8") ->
                "+7" + digits.drop(1)

            digits.startsWith("7") ->
                "+$digits"

            else -> throw IllegalArgumentException("Invalid Russian phone number")
        }
    }
}