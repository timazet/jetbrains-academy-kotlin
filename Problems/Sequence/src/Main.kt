import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = CharArray(3) { scanner.next().first() }
    println(a + 1 == b && b + 1 == c)
}