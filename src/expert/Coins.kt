package expert
//Given an amount of money and an array of coins write a method that computes
//the number of ways to make the amount of money with coins of the available coins.

fun findCombinationsCount(sum: Int, vals: IntArray?): Int {
    if (sum < 0) {
        return 0
    }
    if (vals == null || vals.size == 0) {
        return 0
    }

    val dp = IntArray(sum + 1)
    dp[0] = 1
    for (i in vals.indices) {
        for (j in vals[i]..sum) {
            dp[j] += dp[j - vals[i]]
        }
    }
    return dp[sum]
}