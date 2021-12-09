fun main() {
    val number = readLine()!!.toIntOrNull()
    var count = 0
    var temp = 1

    do {
        repeat(temp) {
            if (count + 1 <= number!!) {
                print("$temp ")
                count++
            }
        }
        temp++
    } while (count < number!!)
}