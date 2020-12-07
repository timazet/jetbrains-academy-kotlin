import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val letters = mutableMapOf<Int, String>()

    while (scanner.hasNext()) {
        val letter = scanner.next()
        letters[letters.size + 1] = letter
        if (letter == "z") break
    }
    print(letters[4])
}