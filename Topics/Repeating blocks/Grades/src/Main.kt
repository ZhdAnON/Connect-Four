fun main() {
    val studentCount = readLine()!!.toIntOrNull()
    var countD = 0
    var countC = 0
    var countB = 0
    var countA = 0
    repeat(studentCount!!) {
        when (readLine()!!.toIntOrNull()) {
            2 -> countD++
            3 -> countC++
            4 -> countB++
            else -> countA++
        }
    }
    println("$countD $countC $countB $countA")
}