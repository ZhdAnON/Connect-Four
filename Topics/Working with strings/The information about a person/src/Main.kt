import java.util.*

fun main() {
    val str = readLine().toString()
    val scanner = Scanner(str)
    val firstName = scanner.next()
    val secondName = scanner.next()
    val age = scanner.nextInt()
    println("${firstName[0]}. $secondName, $age years old")
}