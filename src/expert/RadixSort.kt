package expert

fun  Int.getDigitAt(key:Int):Int{
    val str = this.toString()
    for ((index, value) in str.withIndex()){
        if(key.toChar() == value){
            return index
        }
    }
    return 0
}

fun  Int.digitCount():Int{
    val str = this.toString()
    return str.length
}

fun maxDigits(list: List<Int>) = list.max()