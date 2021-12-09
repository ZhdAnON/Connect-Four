import java.lang.StrictMath.abs
import java.util.*

fun main() {
    val str1 = Scanner(readLine()).useDelimiter(" ")
    val str2 = Scanner(readLine()).useDelimiter(" ")
    val x1 = str1.nextInt()
    val y1 = str1.nextInt()
    val x2 = str2.nextInt()
    val y2 = str2.nextInt()

    val temp1 = abs(y2 - y1) == 1 && abs(x2 - x1) == 2
    val temp2 = abs(y2 - y1) == 2 && abs(x2 - x1) == 1
    if (temp1 || temp2) println("YES")
    else println("NO")
}