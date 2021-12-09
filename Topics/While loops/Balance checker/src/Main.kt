import java.util.*

fun main() {
    var balance = readLine()!!.toIntOrNull()
    val pay = readLine()
    val scanner = Scanner(pay)

    while (scanner.hasNext()) {
        val temp = scanner.nextInt()
        if (balance!! - temp >= 0) balance -= temp
        else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $temp.")
            balance -= temp
            break
        }
    }
    if (balance!! >= 0) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}