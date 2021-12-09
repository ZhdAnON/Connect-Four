fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val temp = numbers.last()
    numbers[numbers.size - 1] = numbers.first()
    numbers[0] = temp
    println(numbers.joinToString(separator = " "))
}