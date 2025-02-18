class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min=nums[0];
        for (int i=0; i<=end; i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}