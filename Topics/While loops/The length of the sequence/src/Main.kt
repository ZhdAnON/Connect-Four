fun main() {
    var count = 0
    do {
        val temp = readLine()!!.toIntOrNull()
        if (temp!! > 0) {
            count++
        }
    } while (temp!! > 0)
    println(count)
}