class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
           int counter = 0 ;
        Boolean flag = false ;
        Set<Character> set = new HashSet<>();
        char [] allowedChar = allowed.toCharArray();
        for (char i : allowedChar)
            set.add(i);
        for (String i : words){
           List<Character> x= prepareString(i);
           if (set.contains(x));
           for (char j : x){
               if (set.contains(j)){
                   flag = true ;
                   continue;
               }
               else {
                   flag = false;
                   break;
               }
           }
           if (flag)
               counter++;

        }
        return counter;
    }
    public static List<Character> prepareString(String str){
        Set<Character> set = new HashSet<>();
        char [] strToChar = str.toCharArray();
        for (char i : strToChar){
            set.add(i);
        }
        // Sorting HashSet using List
        List<Character> list = new ArrayList<Character>(set);
        Collections.sort(list);




        return list;
    }
}
