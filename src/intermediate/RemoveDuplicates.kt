package intermediate

import java.util.*


fun removeDuplicates(nums: IntArray): Int {
    var count = 0
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) {
            nums[i] = Int.MAX_VALUE
            count += 1
        }
    }
    Arrays.sort(nums)
    return nums.size - count
}