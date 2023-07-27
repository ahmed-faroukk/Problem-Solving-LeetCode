import java.util.*

fun main(args: Array<String>) {

    val myStack = Stack<Int>()
    if (myStack.isEmpty())
        println("is empty now ")
    myStack.push(1)
    myStack.push(2)
    myStack.push(3)
    myStack.push(4)
    myStack.pop()
    println("Top is : " + myStack.top())
    println("size = " + myStack.size())
    println("print my stack")
    printStack(myStack)
    // output 
    /*
      is empty now 
      Top is : 3
      size = 3
      print my stack
      3
      2
      1
    */

}
fun printStack(stack : Stack<Int>){
   while (!stack.isEmpty()){
       println(stack.top())
       stack.pop()
   }
}
class Stack<T>() {
    private val stack = mutableListOf<T>()

    fun push(element: T) {
        stack.add(element)
    }

    fun pop() {
        if (stack.isNotEmpty())
            stack.removeAt(stack.size - 1)
    }

    fun top(): T? {
        return if (stack.isNotEmpty())
            stack[stack.size - 1]
        else
            null
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    fun size(): Int {
        return stack.size
    }

}
