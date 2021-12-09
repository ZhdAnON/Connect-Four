fun main() {
    val count = readLine()!!.toIntOrNull()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(count!!) {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! < 0) smaller++
        else if (temp > 0) larger++
        else perfect++
    }
    println("$perfect $larger $smaller")
}