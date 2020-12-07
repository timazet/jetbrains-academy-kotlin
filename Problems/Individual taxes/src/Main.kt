import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val incomes = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val percentage = IntArray(incomes.size) { scanner.nextInt() }

    var companyIndex = -2
    var previousCompanyTax = 0.0
    for (index in incomes.indices) {
        val companyTax = incomes[index] * percentage[index] / 100.0
        if (companyTax > previousCompanyTax) {
            companyIndex = index
            previousCompanyTax = companyTax
        }
    }
    println(companyIndex + 1)
}