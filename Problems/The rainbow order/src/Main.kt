import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println(RainbowColor.findColor(input.next())?.ordinal?.plus(1))
}

enum class RainbowColor {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET;

    companion object {

        fun findColor(color: String): RainbowColor? {
            for (item in values()) {
                if (item.name.equals(color, ignoreCase = true)) {
                    return item
                }
            }
            return null
        }

    }
}