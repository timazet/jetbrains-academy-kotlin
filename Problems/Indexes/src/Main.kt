fun solution(products: List<String>, product: String) {
    val indices = products.mapIndexedNotNull { index, s -> if (s == product) index else null }
    println(indices.joinToString(separator = " "))
}