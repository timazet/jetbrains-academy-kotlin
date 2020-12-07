import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()

    println((group1 + 1) / 2 + (group2 + 1) / 2 + (group3 + 1) / 2)
}