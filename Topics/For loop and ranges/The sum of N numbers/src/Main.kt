fun main() {
    val numberN = readLine()!!.toIntOrNull()
    var result = 0
    repeat(numberN!!) {
        result += readLine()!!.toIntOrNull()!!
    }
    println(result)
}