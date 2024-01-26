package intermediate


fun bubbleSort(list:List<Int>):List<Int> {
    val sorted = list.toMutableList()

    for (index in 0..sorted.lastIndex){
        for (idx in (index+1) .. (sorted.lastIndex)){
            val element = sorted[index]
            val nextElement = sorted[idx]

            if (element > nextElement) {
                sorted[index] = nextElement
                sorted[idx] = element
            }
        }
    }
    return sorted
}