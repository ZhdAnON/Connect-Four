fun main() {
    val str = readLine()
    println(((str!!.toLowerCase().count { it == 'g' || it == 'c' } * 100).toDouble() / str.length))
}