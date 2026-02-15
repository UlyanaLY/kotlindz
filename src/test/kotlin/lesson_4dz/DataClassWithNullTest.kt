package lesson_4dz

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class DataClassWithNullTest {

    @Test
    fun authorTest(){
        val book = BookClass(4, "The Nose", "Anton Chekhov", 150)
        book.bookAuthor shouldBe "Anton Chekhov"
    }

    @Test
    fun titleTest(){
        val book = BookClass(4, "Metro 2033", "Dmitry Glukhovsky", 151)
        book.bookTitle shouldBe "Metro 2033"
    }

    @Test
    fun pageTest(){
        val book = BookClass(4, "Shadow and Bone", "Leigh Bardugo", 152)
        book.bookPages shouldBe 152
    }

    @Test
    fun nullFieldsTest(){
        val book = BookClass(5, null, null, null)
        book.bookTitle shouldBe "Unknown title"
        book.bookAuthor shouldBe "Unknown author"
        book.bookPages shouldBe 0
    }

    @Test
    fun discountTest(){
        val book = BookClass(6, "The Hunger Games", "Suzanne Collins", 200)
         book.priceWithDiscount( 20.0) shouldBe 800.0
    }
}