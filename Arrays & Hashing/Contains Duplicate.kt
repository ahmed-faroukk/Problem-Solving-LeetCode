class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
      val hashset: HashSet<Int> = hashSetOf()

      for (n in nums) {
          if (n in hashset) {
              return true
          }

          hashset.add(n)
      }
          return false

      }
}
