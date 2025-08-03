
class Calculator(val name: String){

    init {
        println("Welcome to $name calculator!")
    }

    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
    fun divide(a: Int, b: Int): Any {
        if (b == 0) {
            return "Division by zero"
        } else {
            return a / b
        }
    }
    fun power(a: Int, b: Int): Int {
        var result = 1
        for (i in 1..b) {
            result *= a
        }
        return result
    }
}

fun main() {
    val myCalculator = Calculator("Temo")
    println(myCalculator.add(2, 3))
    println(myCalculator.subtract(10, 7))
    println(myCalculator.multiply(7, 8))
    println(myCalculator.divide(7, 0))
    println(myCalculator.power(8, 2))
}