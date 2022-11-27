class Solution {
    fun isAnagram(s: String, t: String): Boolean {

           if(s.length !=t.length)
        return false

    val str1 = s.toCharArray().apply { sort() }
    val str2 = t.toCharArray().apply { sort() }

    for (i in 0..s.length-1){
        if(str1[i]!=str2[i])
            return false
    }

    return true




        
    }
}
/*
242. Valid Anagram
Easy

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

 

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

*/
