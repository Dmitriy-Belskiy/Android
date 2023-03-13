class CustomerArray {
    private var arr: IntArray

    constructor(arr: IntArray) {
        this.arr = arr
    }

    constructor() {}

    fun min(): Int {
        return Arrays.stream(arr).min().asInt
    }

    fun max(): Int {
        return Arrays.stream(arr).max().asInt
    }

    fun sum(): Int {
        return Arrays.stream(arr).sum()
    }

    fun oddValues() {
        Arrays.stream(arr).filter { s: Int -> s % 2 != 0 }.forEach { s: Int -> print("$s ") }
    }

    fun arithmeticMean(): Int {
        return sum() / arr.size
    }
}    


object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 3, 34, 456, 56, 567, 6, 7)
        val customerArray = CustomerArray(arr)
        println(customerArray.sum())
        println(customerArray.max())
        println(customerArray.min())
        println(customerArray.arithmeticMean())
        customerArray.oddValues()
    }
}


