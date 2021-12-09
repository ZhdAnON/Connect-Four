// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int): String {
    return a.toString().last().toString()
}
