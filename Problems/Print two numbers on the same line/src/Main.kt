import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b) = IntArray(2) { scanner.nextInt() }
    println("$a $b")
}