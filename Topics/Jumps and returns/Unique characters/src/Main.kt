fun main() {
    val word = readLine()!!
    var count = 0
    for (i in 'a'..'z') {
        if (word.count { it == i } != 1) continue
        count++
    }
    println(count)
}