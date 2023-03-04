class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOflastWord = 0 ;
        for(int i = s.length()-1 ; i >=0 ; i-- ){
            if(lengthOflastWord == 0 && s.charAt(i)==' ')
                continue ; 
                else if(s.charAt(i)==' ')
                    return lengthOflastWord ;
                    else lengthOflastWord++;
        }
        return lengthOflastWord ;
    }
}
