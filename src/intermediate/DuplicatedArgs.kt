package intermediate

//Given variable number of arguments (list of strings) checks whether there are any
//duplicates among the arguments and return list of all unique duplicates.
//If no arguments are passes return empty list.

fun getDuplicatedParams(vararg strings:String):List<Char>?{
    val strList = mutableListOf<String>()

    for (string in strings){
        strList.add(string)
    }
    val strGroup = strList.joinToString("").groupBy { it }
    val repeatedArg = strGroup.filter { it.value.size > 1 }
    return repeatedArg.keys.toList()
}