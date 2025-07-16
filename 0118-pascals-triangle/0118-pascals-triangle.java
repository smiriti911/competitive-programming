class Solution {

    public long combination (int n, int r){
        long result=1;

        for(int i=0; i<r; i++){
            result=result*(n-i);
            result=result/(i+1);
        }

        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> sublist=new ArrayList<>();

            for(int j=0; j<=i; j++){
                sublist.add((int)combination(i, j));
            }

            ans.add(sublist);
        }

        return ans;
    }
}