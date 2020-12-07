import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val country1 = Country.findByName(input.next())
    val country2 = Country.findByName(input.next())
    println(country1 != Country.NULL && country1.currency == country2.currency)
}

enum class Country(val currency: Currency) {

    GERMANY(Currency.EUR),
    MALI(Currency.FCFA),
    DOMINICA(Currency.XCD),
    CANADA(Currency.CAD),
    SPAIN(Currency.EUR),
    AUSTRALIA(Currency.AUD),
    BRAZIL(Currency.BRL),
    SENEGAL(Currency.FCFA),
    FRANCE(Currency.EUR),
    GRENADA(Currency.XCD),
    KIRIBATI(Currency.AUD),
    NULL(Currency.NULL);

    companion object {
        fun findByName(country: String): Country {
            for (item in values()) {
                if (item.name.toLowerCase().capitalize() == country) {
                    return item
                }
            }
            return NULL
        }
    }

}

enum class Currency {
    EUR, FCFA, XCD, CAD, AUD, BRL, NULL
}