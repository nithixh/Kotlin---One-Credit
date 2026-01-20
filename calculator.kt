class Calculator {

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        return if (b != 0.0) {
            a / b
        } else {
            println("Division by zero is not allowed")
            0.0
        }
    }
}

fun main() {
    val calc = Calculator()

    val a = 10.0
    val b = 5.0

    println("Addition       : ${calc.add(a, b)}")
    println("Subtraction    : ${calc.subtract(a, b)}")
    println("Multiplication : ${calc.multiply(a, b)}")
    println("Division       : ${calc.divide(a, b)}")
}
