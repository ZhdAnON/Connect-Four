fun main() {
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    println((backFromTheWall + returnedWatchman).joinToString(", "))
}