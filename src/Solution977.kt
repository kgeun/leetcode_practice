 class Solution977 {
    fun sortedSquares(nums: IntArray): IntArray {
        var resArray = IntArray(nums.size) { nums[it] * nums[it] }
        resArray.sort()
        return resArray
    }
}