package armateur

fun reverseList(list: List<Int>):List<Int>{
    val reversedList = mutableListOf<Int>()

    for (count in (list.size-1) downTo 0 ){
        reversedList.add(list[count])
    }

    return reversedList
}