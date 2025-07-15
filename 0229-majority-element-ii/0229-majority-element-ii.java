class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int count = map.get(nums[i]);

            if (count > (n / 3)) {
                if (!result.contains(nums[i])) {
                    result.add(nums[i]);
                }
            }
        }

        return result;
    }
}