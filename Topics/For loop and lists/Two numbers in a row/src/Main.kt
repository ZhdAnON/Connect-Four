import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numberList = MutableList(scanner.nextInt()) { scanner.nextInt() }
    val numberP = scanner.nextInt()
    val numberM = scanner.nextInt()

    var result = "YES"
    for (i in numberList.indices) {
        var temp1 = 0
        var temp2 = 0
        if (i < numberList.size - 1) {
            temp1 = numberList[i]
            temp2 = numberList[i + 1]
        }
        else {
            temp1 = numberList[numberList.lastIndex - 1]
            temp2 = numberList.last()
        }
        if ((temp1 == numberP && temp2 == numberM) || (temp1 == numberM && temp2 == numberP)) {
            result = "NO"
            break
        }
    }
    println(result)
}