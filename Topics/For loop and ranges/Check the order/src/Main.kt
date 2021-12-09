fun main() {
    val numberN = readLine()!!.toIntOrNull()
    var result = true
    var temp1 = readLine()!!.toIntOrNull()
//    repeat(numberN!! - 1) {
    for (i in 1 until numberN!!) {
        val temp = readLine()!!.toIntOrNull()
        if (temp1 != null) {
            if (temp!! > temp1!!) {
                temp1 = temp
                result = true
            }
            else {
                result = false
                break
            }
        }
    }
    if (result) println("YES")
    else println("NO")
}