class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int currentSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int n :nums){
            currentSum+=n;
            if(map.containsKey(currentSum-k)){
                count+=map.get(currentSum-k);
            }
    
                map.put(currentSum, map.getOrDefault(currentSum,0)+1);
            
        }
        return count;
    }
}