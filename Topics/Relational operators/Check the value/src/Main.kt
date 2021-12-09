fun main() {
    val number = readLine()!!.toIntOrNull()
    if (number in 1..9) println("true")
    else println("false")
}