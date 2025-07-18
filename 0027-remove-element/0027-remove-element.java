class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                j++;
            }
            if(nums[i]==val){
                while(nums[j]==val){
                    if(j==nums.length-1){
                        break;
                    }else{
                        j++;
                    }
                  
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
       int count = 0;
       int i=0;
       while(i<nums.length && nums[i]!=val  ){
        count++;
        i++;
       }
       return count;
    }
}