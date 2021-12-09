fun main() {
    val numberN = readLine()!!.toIntOrNull()
    var result = 0
    repeat(numberN!!) {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! < result || result == 0) result = temp
    }
    println(result)
}