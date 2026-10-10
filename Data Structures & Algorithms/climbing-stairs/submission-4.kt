class Solution {

    val cache = IntArray(46)

    fun climbStairs(n: Int): Int {

        if( n == 1) {
            cache[1] = 1
            return 1
        }

        if(n == 2) {
            cache[2] = 2
            return 2
        }

        if(cache[n] != 0) {
            return cache[n]
        }

        var stairs = 0

        if(n > 2) {
            stairs = climbStairs(n - 2) + climbStairs(n - 1)
            cache[n] = stairs
        }

        return stairs

    }
}