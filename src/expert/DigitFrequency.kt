package expert

fun equalDigitFrequency(str1:String, str2:String):Boolean{
    if(str1.length != str2.length) return false

    val strGroup1 = str1.groupBy { it }
    val strGroup2 = str2.groupBy { it }

    return strGroup1==strGroup2
}