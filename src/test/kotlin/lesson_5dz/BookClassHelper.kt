package lesson_5dz

import lesson_4dz.BookClass

class BookClassHelper {

    companion object {
        fun BookClass.bookFormatNotEmpty(): Boolean {
            return (!title.isNullOrBlank() && !author.isNullOrBlank())
                .also { println("bookFormatNotEmpty result: $it") }
        }

        fun BookClass.isTitleUpperCase(): Boolean {
            return (title?.matches(Regex("[A-ZА-ЯЁ !?.,:;'\"-]+")) ?: false)
                .also { println("Is title uppercase? : $it") }
        }

        infix fun BookClass.isExpensive(expensivePrice: Double): Boolean {
            return price > expensivePrice
        }
   }
}