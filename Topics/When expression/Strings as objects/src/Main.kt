fun main() {
    val input = readLine()!!
    if (input.isNotEmpty()) {
        println(
            message = when (input.first()) {
                'i' -> input.drop(1).toInt() + 1
                's' -> input.drop(1).reversed()
                else -> input
            }
        )
    }
}