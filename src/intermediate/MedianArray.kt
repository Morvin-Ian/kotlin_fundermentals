package intermediate

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedArray = nums1+nums2
    val sortedArray = mergedArray.sorted()
    var median:Double

    if (mergedArray.size % 2 == 0){
        val firstValue = sortedArray[(sortedArray.size/2) -1]
        val secondValue = sortedArray[(sortedArray.size/2)]
        median = (firstValue.toDouble() + secondValue.toDouble())/2.0
        return  median
    }else{
        val midpoint = (sortedArray.size+1)/2
        median = sortedArray[midpoint-1].toDouble()
        return median
    }
}