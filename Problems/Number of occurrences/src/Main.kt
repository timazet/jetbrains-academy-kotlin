fun main() {
    val input = readLine()!!
    val sample = readLine()!!
    println((input.length - input.replace(sample, "").length) / sample.length)
}