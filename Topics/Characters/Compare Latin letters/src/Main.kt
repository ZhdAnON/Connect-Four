fun main() {
    val char1 = readLine()
    val char2 = readLine()
    println(char1.toString().equals(char2.toString(), ignoreCase = true))
}