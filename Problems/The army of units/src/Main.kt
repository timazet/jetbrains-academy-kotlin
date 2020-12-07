import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    when {
        number < 1 -> println("no army")
        number in 1..4 -> println("few")
        number in 5..9 -> println("several")
        number in 10..19 -> println("pack")
        number in 20..49 -> println("lots")
        number in 50..99 -> println("horde")
        number in 100..249 -> println("throng")
        number in 250..499 -> println("swarm")
        number in 500..999 -> println("zounds")
        else -> println("legion")
    }
}