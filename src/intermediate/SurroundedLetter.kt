package intermediate

fun surroundedLetter(string:String):Boolean{

    for ((index, char) in string.withIndex()){
        if(char.isLetter()){
            if(string[index-1] == '+' && string[index+1]== '+'){
                return true
            }else{
                continue
            }
        }
    }

    return false
}