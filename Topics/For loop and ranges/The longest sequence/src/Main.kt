fun main() {
    val numberN = readLine()!!.toIntOrNull()
    val numberList = mutableListOf<Int>()
    repeat(numberN!!) {
        numberList.add(readLine()!!.toIntOrNull()!!)
    }
    numberList.sorted()
    var count = 1
    var temp = numberList[0]
    numberList.forEach { if (it > temp) {
        count++
        temp = it
    } }
    println(count)
}