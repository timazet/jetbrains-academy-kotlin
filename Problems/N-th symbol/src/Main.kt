import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val initialValue = scanner.nextLine()
    val element = scanner.nextInt()

    println("Symbol # $element of the string \"$initialValue\" is '${initialValue[element - 1]}'")
}