import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.next()
    val str2 = scanner.next()
    val str3 = scanner.next()
    val str4 = scanner.next()
    val str5 = scanner.next()
    println("""$str1
        |$str2
        |$str3
        |$str4
        |$str5
    """.trimMargin())
}