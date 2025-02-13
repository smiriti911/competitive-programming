class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0; i<n; i++){
            int freq=map.get(nums[i]);
            if(freq>n/2){
                return nums[i];
            }
        }
        return -1;
        
    }
}