import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sequence = scanner.nextLine()
    val gcCount = sequence.count { it.toLowerCase() == 'g' || it.toLowerCase() == 'c' }
    println(gcCount.toDouble() / sequence.length * 100)
}