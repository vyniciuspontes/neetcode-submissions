class MyLinkedList() {

    class Node(var value: Int, var next: Node? = null, var prev: Node? = null)

    var head: Node? = null
    var tail: Node? = null
    var size: Int = 0

    fun print() {
        var curr = head
        while(curr != null) {
            println(curr?.value)
            curr = curr?.next
        }
    }

    fun get(index: Int): Int {
        if (index < 0 || index >= size) return -1
        var p = head

        for(i in 0 until index) {
            p = p?.next
        }

        return p?.value ?: -1
    }

    fun addAtHead(`val`: Int) {
        if(head == null && tail == null) {
            head = Node(`val`)
            tail = head
        } else {
            val newHead = Node(`val`, head)
            head?.prev = newHead
            head = newHead
        }
        size++
    }

    fun addAtTail(`val`: Int) {
        if(tail == null && head == null) {
            tail = Node(`val`)
            head = tail
        } else {
            var newTail = Node(`val`)
            tail?.next = newTail
            newTail.prev = tail
            tail = newTail
        }
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index < 0 || index > size) return
        if (index == 0) {
            addAtHead(`val`)
            return
        }
        if (index == size) {
            addAtTail(`val`)
            return
        }

        var p1 = head
        for (i in 0 until index - 1) {
            p1 = p1?.next
        }

        var newNode = Node(`val`)
        var next = p1?.next
        p1?.next = newNode
        newNode.prev = p1
        newNode.next = next
        next?.prev = newNode
        size++
    }

    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= size) return

        if (size == 1) {
            head = null
            tail = null
            size = 0
            return
        }

        if (index == 0) {
            head = head?.next
            head?.prev = null
            size--
            return
        }

        if (index == size - 1) {
            tail = tail?.prev
            tail?.next = null
            size--
            return
        }

        var p1 = head
        for (i in 0 until index) {
            p1 = p1?.next
        }

        var prev = p1?.prev
        var next = p1?.next

        prev?.next = next
        next?.prev = prev
        size--
    }
}