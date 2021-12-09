fun main() {
    val numberA = readLine()!!.toIntOrNull()
    val numberB = readLine()!!.toIntOrNull()
    val numberN = readLine()!!.toIntOrNull()
    var count = 0
    for (i in numberA!!..numberB!!) {
        if (i % numberN!! == 0) count++
    }
    println(count)
}