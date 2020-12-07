fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = getHouse(price, rooms)
    println(house.finalPrice())
}

fun getHouse(price: Int, rooms: Int): House {
    return when {
        rooms >= 8 -> Palace(price)
        rooms in 5..7 -> Mansion(price)
        rooms == 4 -> Cottage(price)
        rooms in 2..3 -> Bungalow(price)
        else -> Cabin(price)
    }
}

class Cabin(price: Int) : House(price, 0)
class Bungalow(price: Int) : House(price, 20)
class Cottage(price: Int) : House(price, 25)
class Mansion(price: Int) : House(price, 40)
class Palace(price: Int) : House(price, 60)

open class House(private var price: Int, private val extraPercentage: Int) {
    init {
        price = when {
            price < 0 -> 0
            price > 1_000_000 -> 1_000_000
            else -> price
        }
    }

    fun finalPrice() = price * (100 + extraPercentage) / 100
}