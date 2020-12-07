import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val (line1, line2) = Array<String>(2) { scanner.nextLine() }
    println(line1.equals(line2, true))
}