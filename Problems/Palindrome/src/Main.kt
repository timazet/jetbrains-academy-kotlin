fun main() {
    val input = readLine()!!

    var result = true
    for (i in 0 until input.length / 2) {
        if (input[i] != input[input.length - 1 - i]) {
            result = false
            break
        }
    }
    if (result) {
        println("yes")
    } else {
        println("no")
    }
}