fun main(args: Array<String>) {
    println(factorial(4))
}

fun factorial(n : Int) : Int{
    return if(n<=1)
        n
    else n * factorial(n-1)
}
