fun main() {
    val numberA = readLine()!!.toIntOrNull()
    val numberB = readLine()!!.toIntOrNull()
    var result = 1L
    for (i in numberA!! until numberB!!) { result *= i }
    println(result)
}