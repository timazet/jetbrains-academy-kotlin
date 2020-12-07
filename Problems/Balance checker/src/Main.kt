import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var remainedMoney = scanner.nextInt()
    var overLimitPurchases = 0
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (remainedMoney - purchase < 0) {
            overLimitPurchases += purchase
        } else {
            remainedMoney -= purchase
        }
    }
    if (overLimitPurchases > 0) {
        println("Error, insufficient funds for the purchase. " +
                "You have $remainedMoney, but you need $overLimitPurchases.")
    } else {
        println("Thank you for choosing us to manage your account! You have $remainedMoney money.")
    }
}