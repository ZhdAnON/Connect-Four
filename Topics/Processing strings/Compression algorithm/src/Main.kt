fun main() {
    val str = readLine()!!
    var tempStr = ""
    var count = 1

    if (str.isNotEmpty()) {
        tempStr += str.first()
        for (i in 1..str.lastIndex) {
            if (str[i] == tempStr.last()) {
                count++
            } else {
                tempStr += count
                tempStr += str[i]
                count = 1
            }
        }
        if (tempStr.last().isLetter()) tempStr += count
    }
    println(tempStr)
}