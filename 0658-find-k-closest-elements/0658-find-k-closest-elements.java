import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;

        // Shrinking the window to k elements
        while (r - l + 1 > k) {
            if (x - arr[l] <= arr[r] - x) {
                r--;  // Remove the rightmost element
            } else {
                l++;  // Remove the leftmost element
            }
        }

        // Convert the subarray to a list and return
        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
