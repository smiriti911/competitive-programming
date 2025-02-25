class Solution {
    private long combination (int n, int r){
        long result=1;
        for(long i=0; i<r; i++){
            result= result*(n-i);
            result=result/(i+1);
        }
        return result;
    }
    public List<Integer> getRow(int rowIndex) {
        List ans=new ArrayList<>();

        for(int i=0; i<=rowIndex; i++){
            ans.add(combination(rowIndex, i));
        }

        return ans;
    }
}