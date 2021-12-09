fun main() {
    var number = readLine()!!.toIntOrNull()
    var temp = 0
    while (number != 0) {
        if (number!! > temp) temp = number
        number = readLine()!!.toIntOrNull()
    }
    println(temp)
}