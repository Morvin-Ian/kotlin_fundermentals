package intermediate

import kotlin.reflect.typeOf

fun plusOne(digits: IntArray): Int {
    val stringedList = StringBuilder()
    for (digit in digits){
        stringedList.append(digit.toString())
    }

    val result = stringedList.toString().toInt() + 1
    return result
}