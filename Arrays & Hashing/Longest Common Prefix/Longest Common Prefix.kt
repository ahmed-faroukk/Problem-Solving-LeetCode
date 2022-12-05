class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
         var prefix: String = strs[0]
    if (strs.isEmpty()) return ""

    for (i in 1 until strs.size) {
          //indexOf witll return 0 when str[i] = prefix
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.subSequence(0, prefix.length - 1).toString()
        }
    }
    return prefix

        
    }
}
