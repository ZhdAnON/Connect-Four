fun main() {
    val time = readLine()!!.split(" ")
    val date = readLine()!!.split(" ")
    println("${time.joinToString(":")} ${date.joinToString("/")}")
}