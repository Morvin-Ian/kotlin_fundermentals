package expert


fun isSubstring(string:String, check:String):Boolean{
    if (check.isEmpty()) return true
    val strGroup = string.groupBy { it }
    for(char in check){
        if(char in strGroup.keys){
            continue
        }else{
            return false
        }
    }
    return true
}