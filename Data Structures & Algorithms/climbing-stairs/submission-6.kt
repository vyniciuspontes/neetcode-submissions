class Solution {
    fun climbStairs(n: Int): Int {
        
        var prev = 1
        var curr = 1

        repeat (n - 1) {

            var next = curr + prev
            prev = curr
            curr = next
        }

        return curr
    }
}
