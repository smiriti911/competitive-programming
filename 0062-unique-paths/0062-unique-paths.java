class Solution {
    private int[][] dp;

    public int countPaths(int m, int n){
        if(m==1 && n==1){
            return 1;
        }
        if(m<0|| n<0){
            return 0;
        }
         if(dp[m][n]!=0){
            return dp[m][n];
        }else{
           int left=countPaths(m, n-1);
           int up=countPaths(m-1, n);

           dp[m][n]=left+up;
        }
        

        return dp[m][n];
        
    }
    public int uniquePaths(int m, int n)
    {
        dp= new int[m+1][n+1];
        return countPaths(m,n);
       
    }
}