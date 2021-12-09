fun main() {
    val str = readLine()!!.split("-").toMutableList()
    str.add(str.removeAt(0))
    println(str.joinToString("/"))
}