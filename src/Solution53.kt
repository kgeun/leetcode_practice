class Solution53 {
    fun maxSubArray(nums: IntArray): Int {
        return helper(nums, 0, nums.size - 1)
    }

    fun helper(nums: IntArray, left: Int, right: Int): Int{
        if (left == right) return nums[left]

        val p = (left + right) / 2
        val leftSum = helper(nums, left, p)
        val rightSum = helper(nums, p+1, right)
        val crossSum = crossSum(nums, left, right, p)

        return maxOf(maxOf(leftSum, rightSum), crossSum)
    }

    fun crossSum(nums: IntArray, left: Int, right: Int, p: Int): Int {
        if (left == right) return nums[left]

        var leftSubsum = Int.MIN_VALUE
        var currSum = 0

        for (i in p downTo left) {
            currSum += nums[i]
            leftSubsum = Math.max(leftSubsum, currSum)
        }

        var rightSubsum = Int.MIN_VALUE
        currSum = 0

        for (i in p+1 until right + 1) {
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }

        return leftSubsum + rightSubsum
    }
}