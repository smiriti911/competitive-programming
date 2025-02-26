class Solution {
    private int[][] dp;
    public int min(int m, int n, int[][] arr) {
        if (m == 0 && n == 0) {
            return arr[0][0];
        }
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        int left = min(m, n - 1, arr);
        int up =min(m - 1, n, arr);
         return dp[m][n] = arr[m][n]+Math.min(left, up);

    }

    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        dp=new int[m][n];
        return min(m-1, n-1, grid);
    }
}