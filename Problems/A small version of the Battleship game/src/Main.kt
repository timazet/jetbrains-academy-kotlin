import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val (x1, y1) = IntArray(2) { input.nextInt() }
    val (x2, y2) = IntArray(2) { input.nextInt() }
    val (x3, y3) = IntArray(2) { input.nextInt() }

    var xLine = ""
    for (x in 1..5) {
        if (x != x1 && x != x2 && x != x3) {
            xLine += "$x "
        }
    }
    println(xLine.trim())

    var yLine = ""
    for (y in 1..5) {
        if (y != y1 && y != y2 && y != y3) {
            yLine += "$y "
        }
    }
    println(yLine.trim())
}