package intermediate

fun lengthOfLastWord(s: String): Int {
    val words = s.split(" ").filter { it.length > 0 }
    if( s.length in 1..10000){
        return words[words.size-1].length
    }
    return 0
}