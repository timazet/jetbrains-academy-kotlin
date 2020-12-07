import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (x1, y1, z1) = IntArray(3) { scanner.nextInt() }
    val (x2, y2, z2) = IntArray(3) { scanner.nextInt() }

    val variations = arrayOf(
            arrayOf(x1, y1, z1),
            arrayOf(y1, z1, x1),
            arrayOf(z1, x1, y1),
            arrayOf(z1, y1, x1),
            arrayOf(y1, x1, z1),
            arrayOf(x1, z1, y1)
    )

    for (coordinates in variations) {
        if (coordinates[0] == x2 && coordinates[1] == y2 && coordinates[2] == z2) {
            println("Box 1 = Box 2")
            return
        } else if (coordinates[0] <= x2 && coordinates[1] <= y2 && coordinates[2] <= z2) {
            println("Box 1 < Box 2")
            return
        } else if (coordinates[0] >= x2 && coordinates[1] >= y2 && coordinates[2] >= z2) {
            println("Box 1 > Box 2")
            return
        }
    }
    println("Incomparable")
}