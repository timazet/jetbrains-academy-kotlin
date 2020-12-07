import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (h1, h2, h3) = IntArray(3) { scanner.nextInt() }
    println(h1 >= h2 && h2 >= h3 || h1 <= h2 && h2 <= h3)
}
