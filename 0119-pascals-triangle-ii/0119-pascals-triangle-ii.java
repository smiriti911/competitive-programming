class Solution {

    public long combination(int n, int r){
      long result=1;

      for(int i=0; i<r; i++){
         result=result*(n-i);
         result=result/(i+1);
      }

      return result;
    }
    public List<Integer> getRow(int rowIndex) {
        

        List<Integer> ans= new ArrayList<>();

        for(int j=0; j<=rowIndex; j++){
           int val= (int)combination(rowIndex,j);
           ans.add(val);
        }
        return ans;
    }
}