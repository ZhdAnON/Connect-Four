fun main() {
    val str = readLine()
    val half1 = if (str!!.length % 2 == 0) str.substring(0, str.length / 2 - 1) else str.substring(0, str.length / 2)
    val half2 = str.substring(str.length / 2 + 1, str.length)
    println(half1+half2)
}