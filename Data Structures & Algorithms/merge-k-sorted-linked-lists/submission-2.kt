/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
        fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        
        if(lists.size == 0) return null

        if (lists.size == 2) {
            return this.mergeFunction(lists[0], lists[1])
        }

        if(lists.size == 1) return lists[0]

        var split = lists.size / 2
        var subArray1 = lists.sliceArray(0 .. split)
        var subArray2 = lists.sliceArray(split + 1..<lists.size)

        var result1 = mergeKLists(subArray1)
        var result2 = mergeKLists(subArray2)

        return this.mergeFunction(result1, result2)
    }

    fun mergeFunction(list1: ListNode?, list2: ListNode?): ListNode? {

        var p1 = list1
        var p2 = list2

        var anchor: ListNode? = ListNode(0)
        var curr: ListNode? = anchor

        while (p1 != null && p2 != null) {

            var newNode: ListNode? = null

            if (p1.`val` >= p2.`val`) {
                newNode = ListNode(p2.`val`)
                p2 = p2.next

            } else {
                newNode = ListNode(p1.`val`)
                p1 = p1.next
            }

            curr!!.next = newNode
            curr = curr.next

        }

        while (p1 != null) {
            var newNode = ListNode(p1.`val`)

            curr!!.next = newNode
            curr = curr.next
            p1 = p1.next
        }

        while (p2 != null) {
            var newNode = ListNode(p2.`val`)

            curr!!.next = newNode
            curr = curr.next
            p2 = p2.next
        }

        return anchor!!.next
    }
}
