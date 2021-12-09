fun main() {
    val str = readLine()

    val partLeft = str!!.substring(0, str.length / 2)
    val partRight = if (str.length % 2 != 0) str.substring(str.length / 2 + 1, str.length) else str.substring(str.length / 2, str.length)

    println(if (partLeft == partRight.reversed()) "yes" else "no")
}