fun main() {
    val letter = readLine()!!

    for (i in 'a'..'z') {
        if (i == letter.first()) break
        print(i)
    }
}