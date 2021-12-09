fun main() {
    val number = readLine()!!.toIntOrNull()
    if (number!! > 0) println("positive") else if (number < 0) println("negative") else println("zero")
}