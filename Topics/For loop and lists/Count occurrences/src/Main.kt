fun main() {
    val countNumbers = readLine()!!.toIntOrNull()
    val numberList = List(countNumbers!!) { readLine()!!.toIntOrNull() }
    val numberM = readLine()!!.toIntOrNull()
    var amount = 0
    numberList.forEach { if (it == numberM) amount++ }
    println(amount)
}