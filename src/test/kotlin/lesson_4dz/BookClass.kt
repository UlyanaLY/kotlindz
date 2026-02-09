package lesson_4dz

//• Создать свой собственный DataClass или взять мой
//• Расширить его и добавить NULL поля
//• Обработать NULL поля, так чтобы там реально подставлялось какое-то базовое значение
//• В случае если поле было NULL, выплевывать в терминал текст с предупреждением и значение, которое вы подставили
//• Сделать пару тестов где вы будете проверять что поля измененного обьекта соотвествуют ождаемым

data class BookClass(
    val id: Int,
    var title: String?,
    var author: String?,
    var pages: Int?,
    var price: Double = 1000.0
) {
    init {
        title = title ?: run {
            val defaultValue = "Unknown title"
            println("Title was null! Default value used: $defaultValue")
            defaultValue
        }

        author = author ?: run {
            val defaultValue = "Unknown author"
            println("Author was null! Default value used: $defaultValue")
            defaultValue
        }

        pages = pages ?: run {
            val defaultValue = 0
            println("Pages was null! Default value used: $defaultValue")
            defaultValue
        }
    }
}

fun BookClass.priceWithDiscount(discountPercent: Double): Double {
    val discount = price * (discountPercent / 100)
    return price - discount
}