fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 0..99) numbers.add(0)
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100
    println(numbers.joinToString())
}