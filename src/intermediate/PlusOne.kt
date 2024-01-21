package intermediate

fun plusOne(digits: IntArray): IntArray {
    val result = digits.toList().toMutableList()
    if(result.size in 1..100){
        if(result.max() in 0..9 && result.first() > 0){
            if(result.last() == 9){
                result[result.size-1] = 1
                result.add(0)
            }else{
                result[result.size-1] += 1
            }
        }
    }
    return result.toIntArray()
}