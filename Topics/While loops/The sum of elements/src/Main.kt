fun main() {
    var sum = 0
    do {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! > 0) {
            sum += temp
        }
    } while (temp!! != 0)
    println(sum)
}