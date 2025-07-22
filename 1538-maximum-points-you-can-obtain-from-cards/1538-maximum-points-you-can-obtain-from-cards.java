class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0;
        int rsum=0;
        int i=0;
        int j=nums.length-1;
        for(i=0; i<k; i++){
            lsum+=nums[i];
        }

        int max=lsum;

        for(i=k-1; i>=0; i--){
            lsum-=nums[i];
            rsum+=nums[j];
            j--;

            max=Math.max(max, lsum+rsum);
        }

        return max;
    }
}