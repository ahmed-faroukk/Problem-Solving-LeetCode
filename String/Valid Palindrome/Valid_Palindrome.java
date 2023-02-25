class Solution {
   public static boolean isPalindrome(String s) {

        int right = 0 ;
        int left = s.length()-1;

        while (right<=left){
            char rightPointer = s.charAt(right);
            char leftPointer = s.charAt(left);

            if (!Character.isLetterOrDigit(rightPointer))
                right++;
           else if (!Character.isLetterOrDigit(leftPointer))
                left--;
            else{
                if (Character.toLowerCase(rightPointer)!= Character.toLowerCase(leftPointer))
                    return false;
                right++;
                left--;
            }

        }

return true;
    }
}
