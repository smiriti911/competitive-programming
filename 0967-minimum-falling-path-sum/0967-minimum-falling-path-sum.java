class Solution {
    private int [][]dp;
    public int minSum(int i, int j, int[][] matrix, int n){
        if(j<0 || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int down= minSum(i+1, j, matrix, n);
        int leftdown= minSum(i+1, j-1, matrix, n);
        int rightdown=minSum(i+1, j+1, matrix, n);

        return dp[i][j]=matrix[i][j]+Math.min(down, Math.min(leftdown, rightdown));
    }
    public int minFallingPathSum(int[][] matrix) {
       int n = matrix.length;
        dp = new int[n][n];

        // Initialize dp table with Integer.MAX_VALUE
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int minPathSum = Integer.MAX_VALUE;
        // Try all starting positions in the first row
        for (int j = 0; j < n; j++) {
            minPathSum = Math.min(minPathSum, minSum(0, j, matrix, n));
        }

        return minPathSum;
    }
}