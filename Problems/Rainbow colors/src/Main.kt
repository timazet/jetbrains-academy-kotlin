import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println(RainbowColor.findColor(input.next()) != RainbowColor.NULL)
}

enum class RainbowColor {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET,
    NULL;
    
    companion object {
        
        fun findColor(color: String): RainbowColor {
            for (item in RainbowColor.values()) {
                if (item.name.equals(color, ignoreCase = true)) {
                    return item
                }
            }
            return RainbowColor.NULL
        } 

    }
}
