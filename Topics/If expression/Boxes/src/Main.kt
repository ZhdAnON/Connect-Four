import java.util.*

fun main() {
    val box1 = Scanner(readLine()).useDelimiter(" ")
    val box2 = Scanner(readLine()).useDelimiter(" ")
    val x1 = box1.nextInt()
    val y1 = box1.nextInt()
    val z1 = box1.nextInt()
    val x2 = box2.nextInt()
    val y2 = box2.nextInt()
    val z2 = box2.nextInt()

    val arr1 = arrayOf(x1, y1, z1)
    val arr2 = arrayOf(x2, y2, z2)
    Arrays.sort(arr1)
    Arrays.sort(arr2)
    var eq = 0
    var ge = 0
    var le = 0
    var count = 0
    for (i in arr1.indices) {
        eq += if (arr1[i] === arr2[i]) 1 else -1
        ge += if (arr1[i] >= arr2[i]) 1 else -1
        le += if (arr1[i] <= arr2[i]) 1 else -1
        count++
    }
    if (eq == arr1.size) {
        println("Box 1 = Box 2")
    } else if (ge == arr1.size) {
        println("Box 1 > Box 2")
    } else if (le == arr1.size) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
    count = 0
}