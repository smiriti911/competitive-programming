class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                min= Math.min(min, i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        else return min;
        
    }
}