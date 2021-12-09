fun main() {
    val listSize = readLine()!!.toIntOrNull()
    val numbers = List(listSize!!) { readLine()!!.toIntOrNull() }
    var count = 0
    for (i in 0..numbers.size - 3) { if (numbers[i + 1] == numbers[i]!! + 1 && numbers[i + 2] == numbers[i]!! + 2) count++ }
    println(count)
}