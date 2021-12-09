fun main() {
    val number = readLine()!!.toIntOrNull()
    val temp = number.toString()
    if (temp.length > 1) println(temp[temp.length - 2])
    else println(0)
}