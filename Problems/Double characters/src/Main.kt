fun main() {
    val input = readLine()!!
    var result = ""

    for (ch in input) {
        result += "$ch$ch"
    }
    println(result)
}