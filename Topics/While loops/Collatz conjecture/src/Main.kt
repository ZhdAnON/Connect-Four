fun main() {
    var temp = readLine()!!.toIntOrNull()
    print("$temp ")
    while (temp != 1) {
        if (temp!! % 2 == 0) temp /= 2
        else temp = temp * 3 + 1
        print("$temp ")
    }
}