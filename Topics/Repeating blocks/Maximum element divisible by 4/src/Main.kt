fun main() {
    val count = readLine()!!.toIntOrNull()
    var maxNumber = 0
    repeat(count!!) {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! % 4 == 0 && temp > maxNumber) maxNumber = temp
    }
    println(maxNumber)
}