class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when {
                name == "Moscow" && (value < -92 || value > 57) -> 5
                name == "Hanoi" && (value < -92 || value > 57) -> 20
                name == "Dubai" && (value < -92 || value > 57) -> 30
                else -> value
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
        println(firstCity.name)
    } else if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) {
        println(secondCity.name)
    } else if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) {
        println(thirdCity.name)
    } else {
        print("neither")
    }
}