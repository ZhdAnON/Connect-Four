fun main() {
    val str = readLine().toString()
    val number = readLine()!!.toIntOrNull()
    println("Symbol # $number of the string \"$str\" is '${str[number!! - 1]}'")
}