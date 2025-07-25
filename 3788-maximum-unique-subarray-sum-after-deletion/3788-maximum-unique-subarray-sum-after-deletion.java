class Solution {
    public int maxSum(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
               set.add(nums[i]);
               if(nums[i]>0){
                sum+=nums[i];
               }
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        if (sum <= 0) {
            sum=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                sum = Math.max(sum, arr[i]);
            }
        }

         return sum;
    }
}