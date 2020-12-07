import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    var cursor = input.firstOrNull()
    var count = 0
    var result = ""
    for (ch in input) {
        if (ch == cursor) {
            count++
        } else {
            result += cursor!!.toString() + count
            cursor = ch
            count = 1
        }
    }
    if (cursor != null) {
        result += cursor.toString() + count
    }
    println(result)
}