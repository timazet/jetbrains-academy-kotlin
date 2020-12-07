import java.math.BigInteger
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val value = BigInteger(scanner.nextLine())
    println(value * BigInteger.valueOf(2).pow(63))
}
