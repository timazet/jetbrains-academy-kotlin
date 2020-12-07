import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b) = Array(2) { BigInteger(scanner.nextLine()) }
    println(a * b / a.gcd(b)) //https://en.wikipedia.org/wiki/Least_common_multiple
}
