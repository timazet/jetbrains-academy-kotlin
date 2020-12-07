import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b) = Array(2) { BigInteger(scanner.nextLine()) }
    val sum = a + b
    val aPart = a * BigInteger.valueOf(100) / sum
    val bPart = b * BigInteger.valueOf(100) / sum
    println("$aPart% $bPart%")
}
