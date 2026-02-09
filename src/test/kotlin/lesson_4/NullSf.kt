package lesson_4

class NullSf {
    private fun lolkek() {
        val str: String? = null
        var str2 = "Hello, World!"

        if (str != null) {
            println(str.length)
            println("String is null")
        } else {
            println("String is not null")
            println("Not null...")
        }

        str2 = str2 + str
    }
}