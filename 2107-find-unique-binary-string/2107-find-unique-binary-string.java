class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int n=nums.length;
        for(int str=0; str<n; str++){
            int decimal = Integer.parseInt(nums[str], 2);
            map.add(decimal);
        }
        long bn=(long) Math.pow(2, n);
        int num=0;
        for(int i=0; i<bn; i++){
            if(!map.contains(i)){
                num=i;
                 return String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            }
        }
       
     return "";
       
    }
}