package intermediate



fun <T:Comparable<T>>binarySearch(list:List<T>, value: T):Int{
    var left = 0
    var right = list.lastIndex


    while (left <= right) {
        val middle = (right + left) / 2

        // Check if x is present at mid
        if (list[middle] == value) {
            return middle
        }

        if (list[middle] < value) {
            left = middle + 1 // x greater than middle, so ignore left half
        } else {
            right = middle - 1 // x greater than middle, so , ignore right half
        }
    }

    // not present
    return -1
}