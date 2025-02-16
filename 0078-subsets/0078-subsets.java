import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, nums, 0, new ArrayList<>());
        return list;
    }

    public void backTrack(List<List<Integer>> list, int[] nums, int start, List<Integer> temp) {
        list.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backTrack(list, nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
