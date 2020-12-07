import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = Array(3) { BigInteger(scanner.nextLine()) }
    if (a == b && b == c) {
        println(3)
    } else if (a == b || a == c || b == c) {
        println(2)
    } else {
        println(0)
    }
}