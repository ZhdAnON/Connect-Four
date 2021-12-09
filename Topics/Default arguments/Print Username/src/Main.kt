fun main() {
    entryName(readLine()!!)
}

fun entryName(name: String = "HIDDEN") {
    println(if (name == "HIDDEN") "Hello, secret user!" else "Hello, $name!")
}