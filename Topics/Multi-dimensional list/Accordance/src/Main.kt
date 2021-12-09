fun main() {
    val list = MutableList(2) { MutableList(3) { "0" } }
    for (i in 0 until list.size) {
        for (j in 0 until list[i].size) {
            list[i][j] = "[$i][$j]"
        }
    }
    println(list)
}