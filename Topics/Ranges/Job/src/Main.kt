fun main() {
    val age = readLine()!!.toIntOrNull()
    println(age in 18..59)
}