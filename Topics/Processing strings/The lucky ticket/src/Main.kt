fun main() {
    val str = readLine()

    val firstNumber = str!!.substring(0, 3)
    val endNumber = str.substring(str.length - 3, str.length)

    var sum1 = 0
    var sum2 = 0

    firstNumber.forEach { sum1 += it.toString().toIntOrNull()!! }
    endNumber.forEach { sum2 += it.toString().toIntOrNull()!! }

    println(if (sum1 == sum2) "Lucky" else "Regular")
}