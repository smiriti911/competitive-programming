import java.util.Arrays;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp=new int[n][n];

       for(int[] row : dp){
        Arrays.fill(row,-1);
       }
       
        return helper(0,0,triangle,n,dp);
    }
    public int helper(int i,int j,List<List<Integer>> triangle,int n,int[][] dp){
        if(i==n-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1) return dp[i][j];

        int down=triangle.get(i).get(j) + helper(i+1,j,triangle,n,dp);
        int diagonal=triangle.get(i).get(j) + helper(i+1,j+1,triangle,n,dp);

        return dp[i][j]=Math.min(down,diagonal);
    }
}