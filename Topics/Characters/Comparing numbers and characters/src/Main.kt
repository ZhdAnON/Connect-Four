fun main() {
    val number = readLine()!!.toIntOrNull()
    val char = readLine().toString().first()
    println(char.toInt() == number)
}