fun main() {
    val start1 = readLine()!!.toIntOrNull()
    val end1 = readLine()!!.toIntOrNull()
    val start2 = readLine()!!.toIntOrNull()
    val end2 = readLine()!!.toIntOrNull()
    val number = readLine()!!.toIntOrNull()
    println(number in start1!!..end1!! || number in start2!!..end2!!)
}