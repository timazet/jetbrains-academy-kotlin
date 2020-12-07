import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = DoubleArray(3) { scanner.nextDouble() }
    val discriminant = b.pow(2.0) - 4 * a * c
    val x1 = (-b + sqrt(discriminant)) / (2 * a)
    val x2 = (-b - sqrt(discriminant)) / (2 * a)
    println(min(x1, x2))
    println(max(x1, x2))
}