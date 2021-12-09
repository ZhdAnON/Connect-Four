fun main() {
    val countA = readLine()!!.toIntOrNull()
    val number = MutableList(countA!!) { readLine()!!.toIntOrNull() }
    val temp = number.removeAt(number.lastIndex)
    number.add(0, temp)
    println(number.joinToString(" "))
}