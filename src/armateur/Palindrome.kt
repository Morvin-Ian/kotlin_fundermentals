package armateur

fun <T>isPalindrome(values:T):Boolean{
    if (values is String){
        return  values == values.reversed()
    }
    else if(values is Int){
        var reverseNumber = 0
        var temp = values.toInt()

        while (temp > 0) {
            val remainder = temp % 10
            reverseNumber = (reverseNumber * 10) + remainder
            temp /= 10
        }
        return values.toInt() == reverseNumber
    }
    return  false
}