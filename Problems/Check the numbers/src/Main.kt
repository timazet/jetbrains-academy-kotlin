import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    for (index in array.indices) {
        if (array[index] == n &&
                (array.getOrNull(index - 1) == m || array.getOrNull(index + 1) == m)) {
            println("NO")
            return
        }
    }
    println("YES")
}