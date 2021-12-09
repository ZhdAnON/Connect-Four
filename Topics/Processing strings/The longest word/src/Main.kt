import java.util.*

fun main() {
    val str = readLine()
    val wordList: List<String> = str!!.split(" ")
    println(wordList.find { it.length == wordList.maxOf { word -> word.length } })
}