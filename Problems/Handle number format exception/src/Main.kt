fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.length != 16 + 3 || cardNumber.getOrNull(4) != ' ' ||
            cardNumber.getOrNull(9) != ' ' || cardNumber.getOrNull(14) != ' ') {
        throw Exception("Incorrect card number")
    }
    return cardNumber.replace(" ", "").toLong()
}