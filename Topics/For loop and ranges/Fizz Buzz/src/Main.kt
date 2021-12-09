fun main() {
    val start = readLine()!!.toIntOrNull()
    val end = readLine()!!.toIntOrNull()
    for (i in start!!..end!!) {
        if (i % 3 == 0) print("Fizz")
        if (i % 5 == 0) print("Buzz")
        if (i % 3 != 0 && i % 5 != 0) print(i)
        println()
    }
}