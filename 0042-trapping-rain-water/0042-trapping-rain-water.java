class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] maxleft = new int[n];
        int[] maxright = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxleft[i] = max;
            } else {
                maxleft[i] = max;
            }

        }
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                maxright[i] = max;
            } else {
                maxright[i] = max;
            }

        }
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += Math.min(maxleft[i], maxright[i]) - arr[i];
        }
        return total;
    }
}