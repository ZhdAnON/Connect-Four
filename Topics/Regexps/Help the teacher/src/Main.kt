import java.util.*

fun main() {
    val report = readLine()
    val scanner = Scanner(report!!)
    val number = scanner.nextInt()
    val regex1 = Regex(".?0? wrong answers?")
    if (number < 10) println(report.matches(regex1))
    else println(false)
}