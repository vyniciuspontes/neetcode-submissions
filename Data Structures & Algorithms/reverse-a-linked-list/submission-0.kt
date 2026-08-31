/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        if(head == null) return null
        var newHead = ListNode(head!!.`val`)
        var p1 = head
                
        while(p1?.next != null) {
            p1 = p1.next
            var newNode = ListNode(p1!!.`val`)
            newNode.next = newHead
            newHead = newNode
        }

        return newHead

    }
}
