fun main() {
    val str = readLine()!!.toLowerCase()
    when (str.contains("the")) {
        true -> println(str.indexOf("the"))
        false -> println("-1")
    }
}