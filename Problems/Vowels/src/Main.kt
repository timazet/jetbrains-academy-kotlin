fun main() {
    val letter = readLine()!!.first()

    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u')
    val alphabet = 'a'..'z'
    val vowelsMap = mutableMapOf<Char, Int>()
    for (vowel in vowels) {
        vowelsMap[vowel] = alphabet.indexOf(vowel) + 1
    }

    println(vowelsMap.getOrDefault(letter.toLowerCase(), 0))
}