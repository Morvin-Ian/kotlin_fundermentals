package expert

fun binarySearch(list:List<Int>, key:Int):List<Int> {
    var leftIndex = 0
    val rightIndex = list.lastIndex

    while(leftIndex<= rightIndex){
        val midIndex = (leftIndex+rightIndex)/2

        if(list[midIndex] == key){
            return listOf(midIndex, list[midIndex])
        }else if(list[midIndex] < key){
            leftIndex = midIndex + 1
        }else{
            leftIndex = midIndex - 1
        }
    }

    return  listOf(0)
}