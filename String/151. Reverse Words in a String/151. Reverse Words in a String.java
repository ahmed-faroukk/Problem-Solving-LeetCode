class Solution {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        String str = "";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' && str!= ""){
                list.add(str);
                str = "" ;
            } else if (i==arr.length-1 && arr[i] != ' ') {
                str += arr[i] ;
                list.add(str);
            } else {
                if (arr[i]!=' ')
                str += arr[i] ;
            }

        }

        Collections.reverse(list);
        s = "";
        for (int i = 0 ; i< list.size() ; i++) {
           s+=  list.get(i);
           if (i!= list.size()-1)
               s+=" ";


        }
        return s;
    }
}
