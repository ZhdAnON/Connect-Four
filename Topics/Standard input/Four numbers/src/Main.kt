import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.nextInt()
    val str2 = scanner.nextInt()
    val str3 = scanner.nextInt()
    val str4 = scanner.nextInt()
    println("""$str1
        |$str2
        |$str3
        |$str4
    """.trimMargin())
}