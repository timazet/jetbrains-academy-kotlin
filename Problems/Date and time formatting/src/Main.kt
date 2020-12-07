import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (hours, minutes, seconds) = IntArray(3) { scanner.next().toInt() }
    val (day, month, year) = IntArray(3) { scanner.next().toInt() }

    println("$hours:$minutes:$seconds $day/$month/$year")
}