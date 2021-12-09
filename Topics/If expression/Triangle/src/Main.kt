fun main() {
    val a = readLine()!!.toIntOrNull()
    val b = readLine()!!.toIntOrNull()
    val c = readLine()!!.toIntOrNull()

    if (a!! + b!! > c!! && b + c > a && a + c > b) println("YES") else println("NO")
}