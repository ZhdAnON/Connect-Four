fun main() {
    val listSize = readLine()!!.toIntOrNull()
    var countPositive = 0
    repeat(listSize!!) {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! > 0) {
            countPositive++
        }
    }
    println(countPositive)
}