fun solution(numbers: List<Int>) {
    val divisibleBy2 = numbers.filter { it % 2 == 0 }
    println(divisibleBy2.joinToString(separator = " "))
}