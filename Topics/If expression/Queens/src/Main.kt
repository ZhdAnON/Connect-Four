import java.util.*
import kotlin.math.abs

fun main() {
    val str1 = Scanner(readLine()).useDelimiter(" ")
    val str2 = Scanner(readLine()).useDelimiter(" ")
    val x1 = str1.nextInt()
    val y1 = str1.nextInt()
    val x2 = str2.nextInt()
    val y2 = str2.nextInt()

    val temp1 = x1 == x2 || y1 == y2
    val temp2 = StrictMath.abs(x2 - x1) == StrictMath.abs(y2 - y1)
    if (temp1 || temp2) println("YES") else println("NO")
}