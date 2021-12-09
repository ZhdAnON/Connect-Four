fun main() {    
    val timeStart = readLine()?.toIntOrNull()
    val timeFinish = readLine()?.toIntOrNull()
    val timeSleep = readLine()?.toIntOrNull()

    if (timeStart != null) {
        if (timeSleep in timeStart..timeFinish!!) println("Normal")
        else if (timeSleep != null) {
            if (timeSleep < timeStart) println("Deficiency")
            else println("Excess")
        }
    }
}