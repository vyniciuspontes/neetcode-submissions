class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {

        var p1 = 0
        var p2 = 0

        var p3 = nums1.size - (nums1.size - m)

        while(p1 < nums1.size && p2 < nums2.size) {

            if (nums1[p1] <= nums2[p2]) {

                if(p1 == p3) {
                    nums1[p3] = nums2[p2]
                    p2++
                    p3++
                }

                p1++
            } else {

                var temp = nums1[p1]
                for(i in (p1 + 1) .. p3) {

                    var next = nums1[i]
                    nums1[i] = temp
                    temp = next
                }

                nums1[p1] = nums2[p2]
                p1++
                p2++
                p3++
            }
        }
    }
}
