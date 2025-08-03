
class Calculator(val name: String){

    init {
        println("Welcome to $name calculator!")
    }

    fun add(a: Int, b: Int): Int = a + b
    fun subtract(a: Int, b: Int): Int = a - b
    fun multiply(a: Int, b: Int): Int = a * b
}

fun main() {

}