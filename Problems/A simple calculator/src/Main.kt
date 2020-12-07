import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.nextLong()
    val operation = scanner.next()
    val secondNumber = scanner.nextLong()
    when (operation) {
        "+" -> println(firstNumber + secondNumber)
        "-" -> println(firstNumber - secondNumber)
        "*" -> println(firstNumber * secondNumber)
        "/" -> println(if (secondNumber == 0L) "Division by 0!" else firstNumber / secondNumber)
        else -> println("Unknown operator")
    }
}