// 268. Missing Number
// https://leetcode.com/problems/missing-number/

class Solution268 {
    fun missingNumber(nums: IntArray): Int {

        // Approach 1
        val checkAry = BooleanArray(nums.size + 1)

        for (i in 0 until nums.size) {
            checkAry[nums[i]] = true
        }

        for (i in 0 until checkAry.size) {
            if (!checkAry[i]) return i
        }

        return 0
    }
}