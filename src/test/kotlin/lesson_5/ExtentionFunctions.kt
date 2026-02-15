package lesson_5

import io.kotest.matchers.shouldBe
import lesson_5.PhoneNumberHelper.Companion.validatePhoneNumber
import org.junit.jupiter.api.Test

class ExtensionFunctions {

    @Test
    fun testExtensionFunctions() {
        val phoneNumber = "+1234567890"
        val isValid = PhoneNumberHelper().isPhoneNumberValid(phoneNumber)

        isValid shouldBe true
    }

    @Test
    fun testStringExtensionFunction() {
        val phoneNumber = "+1234567890"
        phoneNumber.validatePhoneNumber() shouldBe true
    }
}

class PhoneNumberHelper {

    fun isPhoneNumberValid(phoneNumber: String): Boolean {
        val regex = Regex("^\\+?[1-9]\\d{1,14}\$")
        return regex.matches(phoneNumber)
    }
    // Use it to avoid concurrent issue
    companion object {
        fun String.validatePhoneNumber(): Boolean {
            val regex = Regex("^\\+?[1-9]\\d{1,14}\$")
            return regex.matches(this)
        }
    }
}