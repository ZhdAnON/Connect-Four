// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false, startPrice: Int = 20000) {
    var result = startPrice - old * 2000
    result =  if (maximumSpeed < 120) result - (120 - maximumSpeed) * 100
    else if (maximumSpeed > 120) result + (maximumSpeed - 120) * 100
    else result + 0
    result -= (kilometers / 10000) * 200
    if (automatic) result += 1500
    println(result)
}