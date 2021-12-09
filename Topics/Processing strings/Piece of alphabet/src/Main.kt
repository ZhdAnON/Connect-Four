fun main() {
    val str = readLine()
    var result = true
    if (str!!.length > 1) {
        var temp = str[0]
        for (i in 1 until str.length) {
            if (temp + 1 == str[i]) {
                temp = str[i]
                result = true
            }
            else {
                result = false
                break
            }
        }
    }
    println(result)
}