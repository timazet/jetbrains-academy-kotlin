fun main() {
    val input = readLine()!!
    if (input.firstOrNull() == 'i') {
        println(input.drop(1).toInt() + 1)
    } else if (input.firstOrNull() == 's') {
        println(input.drop(1).reversed())
    } else {
        println(input)
    }
}