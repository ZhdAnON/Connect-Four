fun main() {
    val number = readLine()!!.toIntOrNull()

    val temp1 = number!! > -15 && number <= 12
    val temp2 = number in 15..16
    val temp3 = number >= 19

    if (temp1 || temp2 || temp3) println("True") else println("False")
}