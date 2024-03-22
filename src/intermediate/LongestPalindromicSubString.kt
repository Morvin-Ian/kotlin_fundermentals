package intermediate

import kotlin.math.max

fun longestPalindrome(s: String): String {
    if (s == s.reversed()) {
        return s
    }

    var longest = ""
    for (index in s.indices) {
        for (x in index + 1..s.length) {
            val chunk = s.substring(index, x)
            if (chunk == chunk.reversed() && chunk.length > longest.length) {
                longest = chunk
            }
        }
    }

    return longest
}