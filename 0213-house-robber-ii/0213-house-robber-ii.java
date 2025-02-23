class Solution {

    private int helper(int[] nums, int i, int j){
        int prev=0;
        int prev2=0;

        for(int x=i; x<=j; x++){
            int curr=Math.max(prev, prev2+nums[x]);
            prev2=prev;
            prev=curr;
        }

        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];

        return Math.max(helper(nums, 0, n-2), helper(nums, 1, n-1));
        
    }
}