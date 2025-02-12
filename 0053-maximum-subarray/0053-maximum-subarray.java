class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i=0;
        if (nums.length > 1) {
            for (i = 0; i < nums.length; i++) {
                sum += nums[i];
                max=Math.max(sum, max);
                if (sum < 0) {
                    sum = 0;
                }
            
            }
        }else{
            max=nums[i];
        }

        return max;
    }
}