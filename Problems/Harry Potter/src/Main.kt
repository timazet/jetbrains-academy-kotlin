import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextLine()) {
        "gryffindor" -> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}