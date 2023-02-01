data class Cat(val weight: Int, val meaw: Int) {    
	fun printWeight() = "Weight is: $weight"
}
fun main(args: Array<String>) {
    val listCat = Array(5) { value -> Cat(value + 1, value)}

    for(element in listCat) {
		println(element)    
	}
}

class Cat (var weight: Int = 0, var meow: Int = 0, var weightPlus: Int = 0, var meowPlus: Int = 0) {
	fun Feeding(): String{
		var weightCycle = weightPlus + weight
		while (weight < weightCycle){
			weight += 1
		}
		return "After Feeding: $weight"
	}
	
	fun FindWeight(): String{
		return "Weight: $weight"
	}
	
	fun MeowDeath(): String{
		var meowCycle = meowPlus + meow
		while (meow < meowCycle) {
			meow += 1
		}
		if (meow >= 10) {
			return "Meow Death: over $meow"
		} else {
			return "Meow: $meow"
		}
	}
}