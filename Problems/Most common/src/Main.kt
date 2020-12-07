//import java.io.File
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val words = mutableMapOf<String, Int>()

    while (scanner.hasNext()) {
        val word = scanner.next()
        if (word == "stop") break
        words.compute(word) { _, count -> (count ?: 0) + 1 }
    }

    var resultWord: String? = null
    var maxCount = -1
    for ((word, count) in words) {
        if (count > maxCount) {
            resultWord = word
            maxCount = count
        }
    }
    println(resultWord)
}

//fun main() {
//    val line = File("/users/timofey_zubkov/Downloads/words_sequence.txt").readLines()
//            .reduce { line1, line2 -> if (line1.length > line2.length) line1 else line2 }
//    println(line.length)

//    val words = File("/users/timofey_zubkov/Downloads/text.txt").readText().split(" ")
//    println(words.size)

//    val fileName = "/users/timofey_zubkov/Downloads/new.txt"
//    val linesLength = File(fileName).length()
//    val lines = File(fileName).readLines().size
//    print("$linesLength $lines")

//    val numbers = File("/users/timofey_zubkov/Downloads/words_with_numbers.txt").readLines()
//                .filter { it.matches(Regex("\\d+")) }
//    println(numbers.size)
//}

