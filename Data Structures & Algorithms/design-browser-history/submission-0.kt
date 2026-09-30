

class BrowserHistory(homepage: String) {

    class Node(var value: String, var next: Node? = null, var prev: Node? = null)

    var anchor = Node(homepage)

    fun visit(url: String) {

        val next = anchor.next
        next?.next = null
        next?.prev = null

        val newNode = Node(url, null, anchor)
        anchor.next = newNode
        anchor = newNode
    }

    fun back(steps: Int): String {

        var counter = 0

        while(anchor.prev != null && counter < steps) {
            anchor = anchor.prev!!
            counter++
        }

        return anchor.value
    }

    fun forward(steps: Int): String {

        var counter = 0

        while(anchor.next != null && counter < steps) {
            anchor = anchor.next!!
            counter++
        }

        return anchor.value
    }

}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */