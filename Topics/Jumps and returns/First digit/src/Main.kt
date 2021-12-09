import java.util.*

fun main() {
    val str = readLine()!!
    str.forEach {
        if (it.isDigit()) {
            println(it)
            return
        }
    }
}