class Solution {
    public int countHillValley(int[] nums) {
        int point = 1;
        int hill = 0;
        int valley = 0;

        List<Integer> list = new ArrayList<>();
        if (nums.length > 0) {
            list.add(nums[0]);
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        Integer[] arr = list.toArray(new Integer[0]);

        while (point < arr.length-1) {
            if (arr[point - 1] < arr[point] && arr[point + 1] < arr[point]) {
                hill++;
            }
             if (arr[point - 1] > arr[point] && arr[point + 1] > arr[point]) {
                valley++;
            }

            point++;
        }

        return hill+valley;
    }
}