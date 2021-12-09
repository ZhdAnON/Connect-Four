// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    val listVowels = listOf('a', 'e', 'i', 'o', 'u')
    return listVowels.contains(letter.toLowerCase())
}
