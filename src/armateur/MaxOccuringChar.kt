package armateur

fun maxOccurringChar(string:String):Any{
    val resultList = arrayListOf<Int>()
    val strGroup = string.groupBy { it }

    for (group in strGroup){
        resultList.add(group.value.size)
    }

    val mostOcurring = strGroup.filter { it.value.size == resultList.max() }
    return mostOcurring.keys
}

private fun maxOccurringChar2(str: String): Char? {
    if (str.isBlank()) return null

    return str.toCharArray()
        .groupBy { it }
        .maxBy { it.value.size }
        .key
}