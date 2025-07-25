class Solution {
    public int maxSum(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
               set.add(nums[i]);
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
       
        if (sum <= 0) {
            sum=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                sum = Math.max(sum, arr[i]);
            }
        }

         return sum;
    }
}