fun main() {
    val str = readLine()
    val strLength = str!!.length
    println("$strLength repetitions of the word $str: ${str.repeat(strLength)}")
}