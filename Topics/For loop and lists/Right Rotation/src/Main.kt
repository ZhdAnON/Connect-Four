fun main() {
    val sizeList = readLine()!!.toIntOrNull()
    val numberList = MutableList(sizeList!!) {readLine()!!.toIntOrNull()!!}
    var countReverses = readLine()!!.toIntOrNull()
    if (countReverses!! > numberList.size) countReverses %= numberList.size
    repeat(countReverses) { numberList.add(0, numberList.removeAt(numberList.lastIndex)) }
    println(numberList.joinToString(" "))
}