import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Int>()
    while (scanner.hasNext()) {
        numbers.add(scanner.nextInt())
    }
    var temp = numbers[0]
    var place = 1
    for (i in 1 until numbers.size) {
        if (numbers[i] > temp) {
            temp = numbers[i]
            place = i + 1
        }
    }
    println("$temp $place")
}