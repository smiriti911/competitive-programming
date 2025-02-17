import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        backTrack(list, 0, nums, new ArrayList<>());
        return list;
    }

    public void backTrack(List<List<Integer>> list, int start, int[] nums, List<Integer> temp) {
        list.add(new ArrayList<>(temp)); // Add the current subset

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // Skip duplicates
            
            temp.add(nums[i]);
            backTrack(list, i + 1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
