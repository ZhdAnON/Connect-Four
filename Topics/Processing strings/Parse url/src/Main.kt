fun main() {
    val str = readLine()!!.toString().split("?")
    val valueStr = str[1].replace("=&", "=not found&").replace("=", " : ").split("&")
    var password = String()
    valueStr.forEach {
        if (it.startsWith("pass")) password = it.replace("pass", "password")
        println(it)
    }
    println(password)
}