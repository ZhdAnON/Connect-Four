fun main() {
    val size = readLine()!!.toInt()
    val incomes = MutableList(size) { readLine()!!.toInt() }
    val taxes = MutableList(size) { readLine()!!.toInt() }
    val taxValues = incomes.withIndex().map { (ind, it) -> it / 100.0 * taxes[ind] }
    val max = taxValues.maxOrNull()
    println(taxValues.indexOf(max) + 1)
}