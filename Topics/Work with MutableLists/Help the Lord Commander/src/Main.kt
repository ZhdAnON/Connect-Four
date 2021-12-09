fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backFromTheWall = readLine()!!.split(", ").map { it }.toMutableList()   
    println(beyondTheWall == backFromTheWall)
}