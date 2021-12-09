fun main() {
    val str = readLine()
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')

    val temp = mutableListOf<Char>()
    val resultList = mutableListOf<Int>()
    for (i in 0 until str!!.length) {
        if (temp.isEmpty()) {
            temp.add(str[i])
//            println("добавлен 1 символ")
            continue
        }
        if (vowels.contains(temp.last()) && vowels.contains(str[i])) {
            temp.add(str[i])
//            println("добавлена гласная")
        }
        else if (!vowels.contains(temp.last()) && !vowels.contains(str[i])) {
            temp.add(str[i])
//            println("добавлена согласная")
        } else {
            if (temp.size >= 3) resultList.add(temp.size)
            for (j in temp.indices) {
                temp.remove(temp.first())
            }
            temp.add(str[i])
//            println("список очищен, добавлен 1 символ")
        }
    }
    resultList.add(temp.size)

    var result = 0
    resultList.filter { it >= 3 }.forEach { result += if (it % 2 != 0) it / 2 else (it / 2) - 1 }
    println(result)
}