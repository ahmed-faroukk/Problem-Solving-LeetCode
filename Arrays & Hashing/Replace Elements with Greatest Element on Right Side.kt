class Solution {
    fun replaceElements(arr: IntArray): IntArray {
  
    var rightMax = -1
    var NextMax = 0 
    var maxOfTwo = 0

    for (i in (0..arr.lastIndex).reversed()){
       
        NextMax = maxOf(rightMax , arr[i])
        arr[i] = rightMax
        rightMax = NextMax

    }
        return arr
        
    }
}
