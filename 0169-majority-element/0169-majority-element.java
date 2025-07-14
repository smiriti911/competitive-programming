class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int n=nums.length/2;

        for(int i=0; i<nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0; i<nums.length; i++){
            int count=map.get(nums[i]);
            if(count>n){
                return nums[i];
            }
        }
        return -1;
    }
}