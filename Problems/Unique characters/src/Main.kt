fun main() {
    val input = readLine()!!

    var duplicates = ""
    var appearOnlyOnce = 0
    rootLoop@ for (i in 0..input.lastIndex) {
        if (duplicates.contains(input[i])) continue@rootLoop
        for (j in i + 1..input.lastIndex) {
            if (input[i] == input[j]) {
                duplicates += input[i]
                continue@rootLoop
            }
        }
        appearOnlyOnce++
    }
    println(appearOnlyOnce)
}