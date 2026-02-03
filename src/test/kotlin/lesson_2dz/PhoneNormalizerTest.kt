package lesson_2dz

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.example.PhoneNormalizer
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Feature("Russian Phone Number Normalization")
@Story("Russian Phone Number Normalization tests")
class PhoneNormalizerTest {
    private val normalizer = PhoneNormalizer()

    @Test
    @DisplayName("Normalizes phone number with plus, spaces, and brackets")
    @Tag("positive")
    fun normalizesWithSpacesAndBrackets() {
        normalizer.normalize("+7 (999) 123-45-67") shouldBe "+79991234567"
    }

    @Test
    @DisplayName("Normalizes phone number starting with 8")
    @Tag("positive")
    fun normalizesStartingWithEight() {
        normalizer.normalize("8 999 123 45 67") shouldBe "+79991234567"
    }

    @Test
    @DisplayName("Normalizes compact phone number")
    @Tag("positive")
    fun normalizeCompactPhone() {
        normalizer.normalize("79991234567") shouldBe "+79991234567"
    }

    @Test
    @DisplayName("Throws error for phone number with less than 11 digits")
    @Tag("negative")
    fun throwLessThanOneDigitError() {
        shouldThrow<IllegalArgumentException> {
            normalizer.normalize("+7 999 123 45")
        }
    }
}