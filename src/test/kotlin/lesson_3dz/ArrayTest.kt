package lesson_3dz

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ArrayTest {
    // 1 Написать тест который будет проверять что массив пустой
    // 2 Напишите тест который проверит что массив НЕ пустой
    // 3 Напишите тест который достанет первый элемент из массива и проверит что соответствует тому, что вы ждете
    // 4 Обратите вниамание на то что будет в выпадашке когда вы вызовите этот массив и нажмете .
    // 5 Также посмотрете какие есть полезные методы в Kotest кроме shoudBe и воспользуйтесь ими

    @Test
    @DisplayName("Array should be empty - 1")
    fun arrayShouldBeEmpty() {
        val array = emptyArray<Int>()
        //можно ли val array = arrayOf<Int>()
        array.shouldBeEmpty()
        //array.shouldHaveSize(0)
    }

    @Test
    @DisplayName("Array should not be empty - 2")
    fun arrayShouldNotBeEmpty() {
        val array = arrayOf(10, 20, 30)
        array.shouldNotBeEmpty()
    }

    @Test
    @DisplayName("Array should have 10 as the first element  - 3")
    fun arrayShouldHaveFirstElement() {
        val array = arrayOf(10, 20, 30)
        array.firstOrNull() shouldBe 10
        //array.shouldStartWith(10)
    }

    @Test
    @DisplayName("Array should not be empty - 3")
    fun arrayShouldContainTenAndThirty() {
        val array = arrayOf(10, 20, 30, 40, 50)
        array.shouldContainAll(10, 30)
    }
}