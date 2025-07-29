class Solution {
    public int jump(int[] nums) {
        int maxIndex = 0;
        int i = 0;
        int jumps = 0;

        while (i < nums.length - 1) {
            maxIndex = Math.max(nums[i] + i, maxIndex);

            // If end is reachable in this jump
            if (maxIndex >= nums.length - 1) {
                jumps++;
                return jumps;
            }

            int max = 0;
            int nextIndex = i;

            for (int j = i + 1; j <= maxIndex; j++) {
                if (nums[j] + j > max) {
                    max = nums[j] + j;
                    nextIndex = j;
                }
            }

            i = nextIndex;
            jumps++;
        }

        return jumps;
    }
}
