fun main() {
    val char1 = readLine().toString().first()
    val char2 = readLine().toString().first()
    val char3 = readLine().toString().first()
    val temp1 = char1.toInt() < char2.toInt() && char2.toInt() < char3.toInt()
    val temp2 = char1 + 1 == char2 && char1 + 2 == char3
    println(temp1 && temp2)
}