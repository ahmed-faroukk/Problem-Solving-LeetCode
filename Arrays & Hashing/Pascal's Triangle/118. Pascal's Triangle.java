class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> Triangle = new ArrayList<>();
        if(numRows == 0) return Triangle ;

        List<Integer> First_Row = new ArrayList<>();
        First_Row.add(1);
        Triangle.add(First_Row);
        for(int i = 1 ; i<numsRows ; i++ ){

            List<Integer> prev_Row = Triangle.get(i-1);
            List<Integer> Row = new ArrayList<>();
            Row.add(1);
            for(int j = 1 ; j<i ;j++){
                Row.add(prev_Row.get(j-1) + prev_Row.get(j));
            }
            Row.add(1);
            Triangle.add(Row);


        }


        return Triangle ;
        


    }
}
