import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstInputTime = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt()
    val secondInputTime = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt()
    println(secondInputTime - firstInputTime)
}