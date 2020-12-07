fun main() {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val input = readLine()!!
    println(alphabet.contains(input, ignoreCase = true))
}