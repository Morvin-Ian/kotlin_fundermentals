package expert

fun chunk(list:List<Int>,chunkSize:Int):List<List<Int>>{
    val result = mutableListOf<List<Int>>()

    for(index in 0..list.lastIndex step chunkSize){
        val rightIndex = if (index + chunkSize < list.size) index + chunkSize else list.size
        val subList = list.subList( index, rightIndex)
        result.add(subList)
    }

    return result
}