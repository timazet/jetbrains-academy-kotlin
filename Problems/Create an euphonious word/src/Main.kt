import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')

    var count = 0
    var isVowel = input.first() in vowels
    var result = 0
    for (ch in input) {
        if (isVowel && ch in vowels || !isVowel && ch !in vowels) {
            count++
        } else {
            result += (count - 1) / 2
            isVowel = ch in vowels
            count = 1
        }
    }
    result += (count - 1) / 2
    println(result)
}