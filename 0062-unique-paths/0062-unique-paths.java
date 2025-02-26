class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize first row and first column to 1
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int up = dp[i - 1][j];   // Paths from top
                int left = dp[i][j - 1]; // Paths from left

                dp[i][j] = up + left; // Sum of both directions
            }
        }

        return dp[m - 1][n - 1]; // Bottom-right cell has the answer
    }
}
