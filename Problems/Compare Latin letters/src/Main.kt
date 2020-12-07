import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b) = CharArray(2) { scanner.next().first() }
    println(a.equals(b, true))
}