// LeetCode 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

class Solution217 {
    fun containsDuplicate(nums: IntArray): Boolean {

        // Third Approach - Set
        val set: MutableSet<Int> = HashSet(nums.size)
        for (x in nums) {
            if (set.contains(x)) return true
            set.add(x)
        }

        return false

//         Second Approach - Sorting
//         nums.sort()
//         for (i in 0 until nums.size - 1) {
//             if (nums[i] == nums[i+1])
//                 return true
//         }
//         return false


//         First Approach - Naive Linear Search
//         for (i in 0 until nums.size) {
//             for (j in i+1 until nums.size) {
//                 if (nums[i] == nums[j]) {
//                     return true
//                 }
//             }
//         }

//         return false
    }
}