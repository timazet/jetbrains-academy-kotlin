import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reeses = scanner.nextInt()
    val weekends = scanner.nextBoolean()
    println(!weekends && reeses >= 10 && reeses <= 20 || weekends && reeses >= 15 && reeses <= 25)
}