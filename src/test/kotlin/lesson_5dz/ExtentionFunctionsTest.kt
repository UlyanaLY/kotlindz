package lesson_5dz

import io.kotest.matchers.shouldBe
import lesson_4dz.BookClass
import lesson_5dz.BookClassHelper.Companion.bookFormatNotEmpty
import lesson_5dz.BookClassHelper.Companion.isExpensive
import lesson_5dz.BookClassHelper.Companion.isTitleUpperCase
import org.junit.jupiter.api.Test

class ExtentionFunctionsTest {

    @Test
    fun bookFormatTest1(){
        val book = BookClass(4, "The Nose", "Anton Chekhov", 150)
        book.bookFormatNotEmpty() shouldBe true
    }

    @Test
    fun bookFormatTest2(){
        val book = BookClass(4, "", "Anton Chekhov", 150)
        book.bookFormatNotEmpty() shouldBe false
    }
    @Test
    fun bookTitleUpperCase(){
        val book = BookClass(4, "THE NOSE", "Anton Chekhov", 150)
        book.isTitleUpperCase() shouldBe true
    }

    @Test
    fun isExpensive(){
        val book = BookClass(4, "The Nose", "Anton Chekhov", 150)
        book isExpensive 100.0 shouldBe true
        book isExpensive 1000.0 shouldBe false
    }
}