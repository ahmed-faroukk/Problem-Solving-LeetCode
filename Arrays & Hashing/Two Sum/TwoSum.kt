
//this is the best solution with time O(n) with hashMap 
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     
         var res : IntArray = intArrayOf()
        var  hashMap : HashMap<Int , Int> = hashMapOf()
        var diff = 0
        for (i in nums.indices){
            diff = target -  nums[i]
            if(diff in hashMap.keys){
                     res =  intArrayOf(hashMap[diff]!!, i)
                    break

            }else{
                hashMap.put( nums[i] , i)
            }
        }


return res

    }
}
// second solution with time O(n^2)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     
        var basePointer = 0
    var i = 1
    while (basePointer < nums.size) {
        if (i == nums.size ) {
            basePointer++
            i = basePointer + 1
        }
        if (nums[i] + nums[basePointer] == target)
            break

        i++
    }
    return intArrayOf(basePointer, i)
    }
}
