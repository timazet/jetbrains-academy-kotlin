val lambda: (Long, Long) -> Long = { leftBorder, rightBorder -> 
    var result = 1L
    for (value in leftBorder..rightBorder) {
        result *= value
    }
    result
}
