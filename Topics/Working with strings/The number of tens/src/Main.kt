fun main() {
    val number = readLine()!!.toIntOrNull()
    println(number.toString()[number.toString().length - 2])
}