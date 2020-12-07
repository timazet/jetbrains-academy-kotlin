import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var maxLength = 0
    var currentLength = 0
    var previous = Int.MAX_VALUE 
    val numbers = scanner.nextInt()
    for (i in 1..numbers) {
        val value = scanner.nextInt()
        if (previous <= value) {
            currentLength++
        } else {
            maxLength = Math.max(maxLength, currentLength)
            currentLength = 1
        }
        previous = value
    }
    maxLength = Math.max(maxLength, currentLength)
    println(maxLength)
}
