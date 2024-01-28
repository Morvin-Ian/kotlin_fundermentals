package expert

fun insertionSort(list:MutableList<Int>):List<Int> {
    for (index in 1..list.lastIndex){
        var prevIndex = index - 1

        while(prevIndex >= 0 && list[prevIndex] > list[index]){
            prevIndex --
        }

        list.removeAt(index).also {
            list.add(prevIndex+1, it)
        }
    }

    return list
}