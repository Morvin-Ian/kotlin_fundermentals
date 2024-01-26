package expert
//Given an amount of money and an array of coins write a method that computes
//the number of ways to make the amount of money with coins of the available coins.

fun getCoins(amount: Int, coins:List<Int>):Int{
    val waysOfDoingNCents = IntArray(amount+1)
    waysOfDoingNCents[0] = 1
    for (coin in coins){
        for(highAmount in coin..amount){
            val highAmountRemainder = highAmount - coin
            waysOfDoingNCents[highAmount] += waysOfDoingNCents[highAmountRemainder]
        }

    }
    return waysOfDoingNCents[amount]
}