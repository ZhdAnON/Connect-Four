fun main() {
    val str1 = readLine()!!
    val operator = readLine()!!
    val str2 = readLine()!!
    println(
        message = when (operator) {
            "equals" -> str1 == str2
            "plus" -> str1 + str2
            "endsWith" -> str1.endsWith(str2)
            else -> "Unknown operation"
        }
    )
}