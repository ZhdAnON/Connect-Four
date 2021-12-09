import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.nextLine()
    val str2 = scanner.next()
    val number1 = scanner.nextInt()
    val number2 = scanner.next()
    println("""$str1
        |$str2
        |$number1
        |$number2
    """.trimMargin())
}