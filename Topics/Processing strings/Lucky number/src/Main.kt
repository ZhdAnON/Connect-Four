fun main() {
    val str = readLine()
    val half1 = str!!.substring(0, str.length / 2)
    val half2 = str.substring(str.length / 2, str.length)

    var sum1 = 0
    var sum2 = 0
    half1.forEach { sum1 += it.toString().toIntOrNull()!! }
    half2.forEach { sum2 += it.toString().toIntOrNull()!! }

    println(if (sum1 == sum2) "YES" else "NO")
}