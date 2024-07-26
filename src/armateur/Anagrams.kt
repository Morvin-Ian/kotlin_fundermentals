package armateur

fun isAnagram(string1:String, string2: String):Boolean {
    val str1Group = string1.lowercase().filter { it.isLetter() }.groupBy { it }
    val str2Group = string2.lowercase().filter { it.isLetter() }.groupBy { it }
    return str1Group == str2Group
}

fun isAnagram2(string1:String, string2: String):Boolean {
    val str1Group = string1.toCharArray().sorted().joinToString("")
    val str2Group = string2.toCharArray().sorted().joinToString("")
    return str1Group == str2Group
}