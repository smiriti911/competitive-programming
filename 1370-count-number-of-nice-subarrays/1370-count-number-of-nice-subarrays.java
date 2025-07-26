class Solution {

    public int atMost(int[] nums , int k){

        if(k<0){
            return 0;
        }
          int count=0;

        Map<Character, Integer> map=new HashMap<>();

        int l=0;
        int r=0;

        while(r<nums.length){
            if(nums[r]%2 != 0){
                map.put('o', map.getOrDefault('o', 0)+1);
            }

            while(map.containsKey('o') && map.get('o')>k){
                if (nums[l] % 2 != 0) {
                    map.put('o', map.get('o') - 1);
                }
                 l++;
            }

            count+=(r-l+1);
            r++;
        }

        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k)- atMost(nums, k-1);
    }
}