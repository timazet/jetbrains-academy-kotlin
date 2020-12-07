fun main() {
    val input = readLine()!!
    val words = input.split(" ").sortedByDescending { word -> word.length }
    println(words[0])
}