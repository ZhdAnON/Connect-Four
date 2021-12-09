fun main() {
    val number1 = readLine()!!.toIntOrNull()
    val number2 = readLine()!!.toIntOrNull()
    val number3 = readLine()!!.toIntOrNull()

    println(number1 != number2 && number1 != number3 && number2 != number3)
}