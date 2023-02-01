data class Cat(val weight: Int, val meaw: Int) {    
	fun printWeight() = "Weight is: $weight"
}
fun main(args: Array<String>) {
    val listCat = Array(5) { value -> Cat(value + 1, value)}

    for(element in listCat) {
		println(element)    
	}
}
fun FindWeight(): String{
	return "Weight: $weight"
}	
