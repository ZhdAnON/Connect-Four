fun main() {
    val size = readLine()!!.toIntOrNull()
    val numbers = mutableListOf<Int>()
    repeat(size!!) {
        numbers.add(readLine()!!.toIntOrNull()!!)
    }
    val numberM = readLine()!!.toIntOrNull()
    var result = "NO"
    numbers.forEach { if (it == numberM) result = "YES" }
    println(result)
}