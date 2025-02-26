import java.util.Arrays;

class Solution {
    private int[][] dp; // Memoization table

    private int countPaths(int m, int n, int[][] arr) {
        // If we go out of bounds, return 0
        if (m < 0 || n < 0) return 0;

        // If cell is an obstacle, return 0
        if (arr[m][n] == 1) return 0;

        // If we reach the top-left corner, there's exactly 1 way
        if (m == 0 && n == 0) return 1;

        // If already computed, return the stored result
        if (dp[m][n] != 0) return dp[m][n];

        // Compute paths from left and above
        int left = countPaths(m, n - 1, arr);
        int up = countPaths(m - 1, n, arr);

        return dp[m][n] = left + up; // Store result in DP table
    }

    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // If the starting cell is an obstacle, return 0 immediately
        if (arr[0][0] == 1) return 0;

        // Initialize memoization table with -1
        dp = new int[m][n];

        return countPaths(m - 1, n - 1, arr);
    }
}
