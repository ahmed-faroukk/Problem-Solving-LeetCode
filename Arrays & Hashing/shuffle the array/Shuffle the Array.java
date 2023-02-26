class Solution {
   public static int[] shuffle(int[] nums, int n) {

        int x [] = new int[n*2];
        int j = 0;
        for(int i =0 ; i < n ; i++){
            x[j] = nums[i];
            j++;
            x[j]=nums[i+n];
            j++;
        }
        return x ;

    }
}
