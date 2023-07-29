import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val queue = Queue<Int>()
    println(queue.isEmpty())
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    println("size of queue is : " + queue.size())
    queue.dequeue()
    queue.enqueue(10)
    queue.display()
    // output is :  
    /* true
       size of queue is : 4
        Queue :
       2
       3
       4
       10 */
}

class Node<T>(val data: T) {
    var next: Node<T>? = null
}

class Queue<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    fun enqueue(data: T) {
        val newNode = Node<T>(data)
        if (head == null) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }

    fun dequeue() {
        if (!isEmpty()) {
            head = head?.next
            if (head == null) {
                tail = null
            }
        }
    }

    fun size(): Int {
        var current = head
        var size = 0
        while (current != null) {
            current = current.next
            size++
        }
        return size
    }

    fun isEmpty(): Boolean {
        return head == null
    }

    fun display() {
        var current = head
        if (current == null)
            println("Empty Queue")
        else {
            println("Queue : ")
            while (current != null) {
                println(current.data)
                current = current.next
            }
        }

    }
}
