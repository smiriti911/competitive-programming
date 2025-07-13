class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int ones=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                ones++;

                if(maxOnes<ones){
                    maxOnes=ones;
                }
            }
            else{
                ones=0;
            }
            i++;
        }
        return maxOnes;
    }
}