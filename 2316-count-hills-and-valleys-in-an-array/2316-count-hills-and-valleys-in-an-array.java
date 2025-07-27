class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            // Skip if current is same as previous
            if (nums[i] == nums[i - 1]) continue;

            // Find previous distinct value
            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) {
                prev--;
            }

            // Find next distinct value
            int next = i + 1;
            while (next < nums.length && nums[next] == nums[i]) {
                next++;
            }

            // Ensure bounds are valid
            if (prev >= 0 && next < nums.length) {
                if (nums[i] > nums[prev] && nums[i] > nums[next]) {
                    count++; // hill
                } else if (nums[i] < nums[prev] && nums[i] < nums[next]) {
                    count++; // valley
                }
            }
        }

        return count;
    }
}
