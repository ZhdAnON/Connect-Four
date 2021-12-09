import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    val number = scanner.nextInt()
    println(if (number < str.length) str.drop(number) + str.take(number) else str)
}