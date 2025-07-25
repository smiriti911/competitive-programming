class Solution {
    public int maxSum(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (!set.contains(nums[i]) && nums[i]>0) {
                set.add(nums[i]);
               
                    sum += nums[i];
                
            }
        }

        return sum > 0 ? sum : max;
    }
}