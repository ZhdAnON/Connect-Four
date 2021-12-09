import java.util.*

fun main() {
    val amountNumbers = readLine()!!.toIntOrNull()
    val numbers = List(amountNumbers!!) { readLine()!!.toIntOrNull() }
    val numbersPM = readLine()
    val scanner = Scanner(numbersPM)
    val numberP = scanner.nextInt()
    val numberM = scanner.nextInt()
    var resultP = false
    var resultM = false
    for (i in numbers.indices) {
        if (numbers[i] == numberP) resultP = true
        if (numbers[i] == numberM) resultM = true
    }
    if (resultP && resultM) println("YES")
    else println("NO")
}