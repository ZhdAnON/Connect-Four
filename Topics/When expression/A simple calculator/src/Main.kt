import java.util.*

fun main() {
    val str = readLine()!!
    val scanner = Scanner(str)
    val firstNumber = scanner.nextLong()
    val operator = scanner.next()
    val secondNumber = scanner.nextLong()

    println(
        message = when (operator) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "/" -> {
                if (secondNumber == 0L) "Division by 0!" else firstNumber / secondNumber
            }
            "*" -> firstNumber * secondNumber
            else -> "Unknown operator"
        }
    )
}