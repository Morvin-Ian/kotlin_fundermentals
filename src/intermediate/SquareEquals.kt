package intermediate

//Given two lists of integers implement a function which returns true if every value in
//the first list has it's corresponding value squared in the second list. The frequency of values
//must be the same eg. if there are two values in first list, two exactly two squared values must exist
//in second list.

fun squareEquals(list1:List<Int>, list2: List<Int>):Boolean{
    val squareList = mutableListOf<Int>()

    list1.forEach{
        squareList.add(it*it)
    }

    if (squareList.size == list2.size){
        for(data in squareList){
            if (data in list2){
                continue
            }else{
                return false
            }
        }
    }else {
        return false
    }

    return true
}