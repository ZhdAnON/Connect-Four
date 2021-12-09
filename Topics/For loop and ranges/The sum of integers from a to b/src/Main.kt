fun main() {
    val numberA = readLine()!!.toIntOrNull()
    val numberB = readLine()!!.toIntOrNull()
    var result = 0
    if (numberA!! < numberB!!) {
        for (i in numberA..numberB) {
            result += i
        }
    }
    println(result)
}