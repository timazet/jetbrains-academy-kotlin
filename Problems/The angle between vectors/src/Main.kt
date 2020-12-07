import java.util.*
import kotlin.math.acos
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val (x1, y1) = DoubleArray(2) { scanner.nextDouble() }
    val (x2, y2) = DoubleArray(2) { scanner.nextDouble() }

    val angleCos = (x1 * x2 + y1 * y2) / (sqrt(x1 * x1 + y1 * y1) * sqrt(x2 * x2 + y2 * y2))
    println(Math.toDegrees(acos(angleCos)))
}