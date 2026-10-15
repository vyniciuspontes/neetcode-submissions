class Solution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

        var valid = m

        var p1 = m - 1
        var p2 = n - 1
        var p3 = nums1.size - 1

        while (p1 >= 0 && p2 >= 0) {

            if(nums1[p1] >= nums2[p2]){

                nums1[p3] = nums1[p1]
                p3--
                p1--
                valid--
            } else {
                nums1[p3] = nums2[p2]
                p3--
                p2--
                valid--
            }
        }

        if(m == 0 || p1 < 0) {
            for (i in 0 .. p2) {
                nums1[i] = nums2[i]
            }
        }
    }
}
