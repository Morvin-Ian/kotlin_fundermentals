package intermediate

fun selectionSort(list:List<Int>):List<Int>{
    val sorted = list.toMutableList()

    for( x in 0..sorted.lastIndex){
        var minIndex= x

        for( y in (x+1)..sorted.lastIndex){
            if(sorted[minIndex] > sorted[y]){
                minIndex = y
            }
        }

        if (minIndex != x) {
            val temp = sorted[x]
            sorted[x] = sorted[minIndex]
            sorted[minIndex] = temp
        }

    }

    return sorted
}