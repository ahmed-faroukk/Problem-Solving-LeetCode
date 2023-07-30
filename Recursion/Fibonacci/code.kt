
fun main(args: Array<String>) {
  
    println(fibonacci(6))
}


fun fibonacci(n : Int) : Int{
    return if(n<=1)
        n
    else fibonacci(n-1) + fibonacci(n-2)
}

// how it works
// input is 4
/*
* process :
* (3)   +  (2)
* (2)   +  (1) + (1)  +  (0)         1 is 1 and 0 is 0
* (1)+(0) +  (1)(0)  +(1)+(0)
* == 1 + 1 + 1
* == 3
* */
