fun main() {
    val number = readLine()!!.toIntOrNull()
    var temp = 1
    while (temp * temp <= number!!) {
        println(temp * temp)
        temp++
    }
}