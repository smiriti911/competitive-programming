class Solution {
    public int digitSum(int num){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            return sum;
    }

    public int maximumSum(int[] nums) {
        
        HashMap<Integer,Integer> sumTrack=new HashMap<>();
        int max=-1;
        
        for(int i=0; i<nums.length; i++){
           int sum=digitSum(nums[i]);
          
          if(sumTrack.containsKey(sum)){
              int numSum=sumTrack.get(sum)+nums[i];
              max=Math.max(max,numSum);
              sumTrack.put(sum, Math.max(sumTrack.get(sum), nums[i]));
            } else {
                sumTrack.put(sum, nums[i]);
            }
        }
      return max;
        
    }
}