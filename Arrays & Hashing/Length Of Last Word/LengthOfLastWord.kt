class Solution {
    fun lengthOfLastWord(s: String): Int {
        
    var counter = 0
    var saveTheLast = 0
    for (i in s) {
        if (i == ' ')
            counter = 0
        else {
            counter++
            saveTheLast = counter
        }
    }

    return saveTheLast
        
        
    }
}
