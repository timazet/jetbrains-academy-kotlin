import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (firstName, lastName, age) = Array<String>(3) { scanner.next() }
    println("${firstName.first()}. $lastName, $age years old")
}