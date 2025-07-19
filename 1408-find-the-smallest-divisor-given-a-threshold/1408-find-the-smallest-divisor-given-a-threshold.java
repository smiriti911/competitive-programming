class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
             max=Math.max(max, nums[i]);
        }
        
        int start=1;
        int end=max;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            long sum=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i]<mid){
                    sum++;
                }else if(nums[i]>=mid){
                    if(nums[i]%mid==0){
                        sum+=nums[i]/mid;
                    }
                    else{
                        sum+=nums[i]/mid+1;
                    }
                }
            }

            if(sum<=threshold){
                ans=Math.min(ans, mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}