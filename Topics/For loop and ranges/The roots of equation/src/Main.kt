fun main() {
    val numberA = readLine()!!.toIntOrNull()
    val numberB = readLine()!!.toIntOrNull()
    val numberC = readLine()!!.toIntOrNull()
    val numberD = readLine()!!.toIntOrNull()
    for (x in 0..1000) { if (numberA!! * x * x * x + numberB!! * x * x + numberC!! * x + numberD!! == 0) println(x) }
}