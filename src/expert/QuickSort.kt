package expert

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun quickSort(list: MutableList<Int>): List<Number> {
    if (list.isEmpty()) {
        return list
    }

    val pivot = list.first() // We selected first element as pivot (it can be any element)
    var pivotIndex = 0 // first index that we can swap (number of element that are less than pivot)

    for (index in 0..list.lastIndex){
        if (pivot > list[index]) {
            list.swap(index, pivotIndex + 1)
            pivotIndex++
        }
    }
    // Move element to the correct index
    // All elements smaller than element will be on the left side of the array (smaller indexes)
    // All elements larger than element will be on the left side of the array (lager indexes)
    list.swap(0, pivotIndex)

    // Create left sub-list
    val left = list.subList(0, pivotIndex)

    // Create right sub-list
    val right = list.subList(pivotIndex + 1, list.size)

    return quickSort(left) + listOf(pivot) + quickSort(right)
}