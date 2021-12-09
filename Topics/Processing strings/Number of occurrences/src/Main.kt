fun main() {
    val str = readLine()
    val subStr = readLine()
    val resultStr = str!!.split(subStr!!)
    println(resultStr.size - 1)
}