fun main() {
    val numberN = readLine()!!.toIntOrNull()
    val list = mutableListOf<Int>()
    repeat(numberN!!) {
        list.add(readLine()!!.toIntOrNull()!!)
    }
    if (numberN == 1) println(list[0])
    else {
        val number1 = list.maxOrNull()!!
        list.remove(number1)
        val number2 = list.maxOrNull()!!
        list.remove(number2)
        println(number1 * number2)
    }
}