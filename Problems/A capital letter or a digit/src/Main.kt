import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char = scanner.next().first()
    println(char in 'A'..'Z' || char in '1'..'9')
}