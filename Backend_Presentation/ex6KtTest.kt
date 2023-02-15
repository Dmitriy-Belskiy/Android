data class Square(
    val width: Double,
    val height: Double,
    val inStock: Boolean
)


val square1 = Square(10.0, 7.0)
val square2 = Square(10.0, 7.0)


assertEquals(product1, product2)
assertEquals(product1.hashCode(), product2.hashCode())

println(product1.toString())
println(product2.toString())
