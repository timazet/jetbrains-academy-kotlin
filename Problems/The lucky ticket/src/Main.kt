fun main() {
    val input = readLine()!!
    var result = 0
    for (index in input.indices) {
        if (index + 1 <= input.length / 2) {
            result += Character.getNumericValue(input[index])
        } else {
            result -= Character.getNumericValue(input[index])
        }
    }
    if (result == 0) {
        println("Lucky")
    } else {
        println("Regular")
    }
}