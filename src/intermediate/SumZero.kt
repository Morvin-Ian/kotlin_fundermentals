package intermediate

//Given sorted list of integers implement a function which finds the first pair
//where the sum equals to 0. Return a pair that includes both values that sum to
//zero or null if a pair does not exist.
//[2,5,7,8]
fun sumZero(list:List<Int>):List<Int>?{
    for(index in 0..list.lastIndex){
        for(x in (index+1)..list.lastIndex){
            if((list[index] + list[x]) == 0) {
                return listOf(list[index], list[x])
            }else{
                continue
            }
        }
    }
    return null
}