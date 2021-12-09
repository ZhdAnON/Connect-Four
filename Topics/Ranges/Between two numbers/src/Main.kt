fun main() {
    val number = readLine()!!.toIntOrNull()
    val start = readLine()!!.toIntOrNull()
    val end = readLine()!!.toIntOrNull()
    println(number in start!!..end!!)
}