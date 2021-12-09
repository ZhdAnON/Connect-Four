fun main() {
    val numbers = readLine()!!.split(' ').map{it.toInt()}.toMutableList()
    var sum = 0
    for (i in 0 until numbers.size) {
        sum += numbers[i]
    }
    numbers.add(0, sum)
    numbers.removeAt(numbers.lastIndex - 1)
    println(numbers.joinToString(" "))
}