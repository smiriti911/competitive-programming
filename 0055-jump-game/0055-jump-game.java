class Solution {
    public boolean canJump(int[] nums) {
        
        int maxIndex=0;

        for(int i=0; i<nums.length; i++){

             if (i > maxIndex) {
                return false; 
            }
            maxIndex=Math.max(nums[i]+i, maxIndex);
           
            if(maxIndex>=nums.length){
                return true;
            }
            
        }
        return true;
    }
}