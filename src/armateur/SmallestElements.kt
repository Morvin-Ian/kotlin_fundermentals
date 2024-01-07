package armateur// Implement a function that takes a list of integers and an integer count as input parameters.
// The purpose of the function is to find the smallest count numbers from the provided list.

// val list = listOf(5, 1, 3)
// smallestElements(list, 2) shouldBeEqualTo listOf(3, 1)

fun smallestElements(list:List<Int>, size:Int):List<Int>{
    val sortedList = list.sorted()
    return sortedList.subList(0,size)
}

