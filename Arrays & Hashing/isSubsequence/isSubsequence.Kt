class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        
    var pointerInsub = 0
    var counter = 0
    val tt = t.toCharArray()
    val ss = s.toCharArray()
    for (i in (tt.indices)) {
         if (pointerInsub == ss.size)
            break
        
        if (ss[pointerInsub] == tt[i]) {
            pointerInsub++
            counter++
        }
       
    }
    return counter==ss.size
        
    }
}
