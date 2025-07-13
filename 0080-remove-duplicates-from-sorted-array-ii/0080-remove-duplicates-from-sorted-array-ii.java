class Solution {
     public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2; // Place to insert next valid number

        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}