fun main() {
    val confession = readLine().toBoolean()
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()


    println(confession xor (firstAnswer == secondAnswer))
}