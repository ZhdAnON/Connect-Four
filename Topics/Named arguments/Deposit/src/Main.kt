import kotlin.math.pow

fun main() {
    val parameterName = readLine()!!
    val parameter = readLine()!!.toDouble()
    println(
        when (parameterName) {
            "amount" -> finalAmount(amount = parameter)
            "percent" -> finalAmount(percent = parameter)
            "years" -> finalAmount(years = parameter)
            else -> finalAmount()
        }
    )
}

fun finalAmount(amount: Double = 1000.0, percent: Double = 5.0, years: Double = 10.0): Int {
    return (amount * (1 + percent / 100).pow(years)).toInt()
}