class Solution {
    private Boolean [][]dp;
    public boolean help(int n, int [] nums, int target){
        if(target==0){
            return true;
        }
        if(n==0)return false;

        if(dp[n-1][target]!=null) return dp[n-1][target];
        boolean not=help(n-1, nums, target);

        boolean take=false;

        if(target>=nums[n-1]){
            take=help(n-1, nums, target-nums[n-1]);
        }

        return  dp[n-1][target]=not||take;

    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int target=0;
   
        for(int i=0; i<n; i++){
            target+=nums[i];
        }
        if(target%2==1){
            return false;
        }
        target=target/2;
        dp=new Boolean[n][target+1];
        return help(n, nums, target);
    }
}