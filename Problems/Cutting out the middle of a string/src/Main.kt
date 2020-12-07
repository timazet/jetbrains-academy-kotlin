fun main() {
    val input = readLine()!!
    val left: String
    val right: String
    if (input.length % 2 == 0) {
        left = input.substring(0, input.length / 2 - 1)
        right = input.substring(input.length / 2 + 1)
    } else {
        left = input.substring(0, input.length / 2)
        right = input.substring(input.length / 2 + 1)
    }
    println(left + right)
}