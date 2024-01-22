package expert

fun maxChunkSum(list:List<Int>, chunk_size:Int):Int?{
    val result = mutableListOf<List<Int>>()

    for(index in 0..list.lastIndex step chunk_size){
        val rightIndex = if(index+chunk_size<list.size) index+chunk_size else list.size
        val subList = list.subList(index, rightIndex)
        result.add(subList)
    }

    val group = result.groupBy { it.sum() }
    return group.keys.maxOrNull()
}