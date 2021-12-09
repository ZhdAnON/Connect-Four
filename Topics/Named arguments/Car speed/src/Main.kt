fun main(args: Array<String>) {
    val currentSpeed = readLine()!!.toInt()
    when(val speedLimit = readLine()!!) {
        "no limit" -> checkSpeed(currentSpeed)
        else -> checkSpeed(currentSpeed, speedLimit.toInt())
    }
}

fun checkSpeed(speed: Int, limit: Int = 60) {
    println(
        if (speed <= limit) "Within the limit"
        else "Exceeds the limit by ${speed - limit} kilometers per hour"
    )
}