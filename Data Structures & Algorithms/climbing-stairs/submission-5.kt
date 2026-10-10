class Solution {

    val cache = mutableMapOf<Int, Int>()

    fun climbStairs(n: Int): Int {

        if (n <= 2) {
            return n
        }

        if(cache[n] != null) {
            return cache[n]!!
        }

        var stairs = 0

        if(n > 2) {
            stairs = climbStairs(n - 2) + climbStairs(n - 1)
            cache[n] = stairs
        }

        return stairs

    }
}