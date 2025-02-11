class Solution {
    public int pivotIndex(int[] nums) {

        int n=nums.length;
        for(int i=1; i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int pivot=0; pivot<n ;pivot++){
            int right=nums[n-1]-nums[pivot];
            if(pivot==0){
                int left=0;
                if(left==right){
                    return pivot;
                }
            }
            else{
                int left=nums[pivot-1];
                if(left==right){
                    return pivot;
                }
            }

        }
        return -1;
        
    }
}