import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = CharArray(4) { scanner.next().first() }

    print(a.isDigit())
    print('\\')
    print(b.isDigit())
    print('\\')
    print(c.isDigit())
    print('\\')
    print(d.isDigit())
}