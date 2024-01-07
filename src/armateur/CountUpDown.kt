package armateur

fun countUpDown(value:Int):List<Int>{
    val result = mutableListOf<Int>()
    val count = 0

    for (count in count..value){
        result.add(count)

        if (count == value){
            for(count in value downTo 0){
                if (count != value){
                    result.add(count)
                }
            }
        }
    }

    return result
}