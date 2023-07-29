
fun main(args: Array<String>) {
    val linkedList: SingleLinkedList<Int> = SingleLinkedList()
    linkedList.insert(1)
    linkedList.insert(2)
    linkedList.insert(3)
    linkedList.insert(4)
    linkedList.display()
    //output 
    //1 -> 2 -> 3 -> 4 -> null

}

class Node<T>(val data: T) {
    var next: Node<T>? = null
}

class SingleLinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun insert(data: T) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }

    fun display() {
        var current = head
        if (current == null)
            println("your linked-list is Empty") else {
            while (current != null) {
                print("${current.data} -> ")
                current = current.next
            }
            println("null")
        }
    }
}
