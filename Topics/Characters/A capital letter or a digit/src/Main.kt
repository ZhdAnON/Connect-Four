fun main() {
    val temp = readLine()!!.first()
    println(temp.isUpperCase() || (temp.isDigit() && temp.toString().toInt() in 1..9))
}