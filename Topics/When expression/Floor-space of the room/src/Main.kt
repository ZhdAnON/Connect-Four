import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println(
        message = when (readLine()!!) {
            "triangle" -> {
                val a = readLine()!!.toDouble()
                val b = readLine()!!.toDouble()
                val c = readLine()!!.toDouble()
                sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))
            }
            "rectangle" -> readLine()!!.toDouble() * readLine()!!.toDouble()
            "circle" -> 3.14 * readLine()!!.toDouble().pow(2)
            else -> {"Unknown input"}
        }
    )
}