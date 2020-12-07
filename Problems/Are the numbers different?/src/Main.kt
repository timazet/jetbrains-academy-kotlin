import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = IntArray(3) { scanner.nextInt() }
    println(a != b && b != c && c != a)
}