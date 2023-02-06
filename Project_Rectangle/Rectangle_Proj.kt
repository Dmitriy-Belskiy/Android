// Попытка написания класса Rectangle на основе примера
// class Rectangle{
//     constructor(
//         val widht: Int,
//         val height: Int
//     ){
//         constructor(
//             widht
//         )
//     }
// }


class Rectangle
constructor(
    val widht: Int,
    val height: Int
) {
    constructor(
        widht: String,
        height: String
    ) : this(Int(widht), Int(height))

    fun format(locale: Locale): String {
        val formatter = NumberFormat.getCurrencyInstance(locale)
        formatter.height = height
        return formatter.format(widht)
    }
    operator fun minus(other: Cash): Cash {
        require(height == other.height) {
            "Rectangle should be of the same height"
        }
        return Rectangle(widht - other.widht, height)
    }
}