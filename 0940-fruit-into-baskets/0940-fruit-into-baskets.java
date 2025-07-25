class Solution {
    public int totalFruit(int[] nums) {
        int l=0;
        int r=0;

        int maxLen=0;

        Map <Integer, Integer> map= new HashMap<>();

        while(r<nums.length){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);

            if(map.size()>2){
                map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                
                }
                  l++;
                  
            }
            if(map.size()<=2){
                maxLen= Math.max(maxLen, r-l+1);
              
            }
              r++;
        }

        return maxLen;
    }
}