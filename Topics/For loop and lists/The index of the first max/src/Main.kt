fun main() {
    val count = readLine()!!.toIntOrNull()
    val numbers = List(count!!) { readLine()!!.toIntOrNull() }
    val maxNumberIndex = numbers.indexOf(numbers.maxByOrNull { it!! })
    println(maxNumberIndex)
}
