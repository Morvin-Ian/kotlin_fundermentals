package expert

fun chunk(list:List<Int>,chunk_size:Int):List<List<Int>>{
    val result = mutableListOf<List<Int>>()

    for(index in 0..list.lastIndex step chunk_size){
        val rightIndex = if (index + chunk_size < list.size) index + chunk_size else list.size
        val subList = list.subList( index, rightIndex)
        result.add(subList)
    }

    return result
}