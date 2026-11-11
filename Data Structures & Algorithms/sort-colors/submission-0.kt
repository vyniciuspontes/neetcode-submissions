class Solution {
    fun sortColors(nums: IntArray) {

        val counts = intArrayOf(0, 0, 0)

        for (n in nums) {
            counts[n]++
        }

        var count = 0

        for (i in counts.indices) {
            for (j in 0 until counts[i]) {
                nums[count] = i
                count++
            }
        }
    }
}

