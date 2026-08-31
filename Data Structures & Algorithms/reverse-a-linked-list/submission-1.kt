/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        if(head == null) return null
        
        var newHead = head
        var previousHead: ListNode? = null

        while(newHead != null) {
            
            val nextHead = newHead.next
            newHead.next = previousHead
            previousHead = newHead
            newHead = nextHead
        }

        return previousHead

    }
}
