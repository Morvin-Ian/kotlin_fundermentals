package armateur

fun maxOccurringChar(string:String):Char{
    val strGroup = string.groupBy { it }
    val mostOccurring = strGroup.maxBy { it.value.size }
    return mostOccurring.key
}