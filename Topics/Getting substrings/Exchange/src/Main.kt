fun main() {
    val str = readLine()
    val firstChar = str!!.first()
    val lastChar = str.last()
    println(lastChar + "" +  str.substring(1, str.length - 1) + "" + firstChar)
}