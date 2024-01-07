package armateur

fun hasRepetedChar(string:String):Boolean {
    val strGroup = string.groupBy { it }
    for(group in strGroup){
        if (group.value.size > 1){
            return true
        }
    }
    return false
}