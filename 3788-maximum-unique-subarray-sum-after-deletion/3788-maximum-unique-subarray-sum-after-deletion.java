class Solution {
    public int maxSum(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                nums[i] = 0;
            } else {
                set.add(nums[i]);
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                sum+=arr[i];

                max=Math.max(sum, max);
            }
        }
       
        if (max <= 0) {
            max=Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
        }

         return max;
    }
}