class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums); // Optional but helps prevent duplicate triplets

        for (int i = 0; i < n - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int k = -(nums[i] + nums[j]);
                if (seen.contains(k)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(triplet); // Ensure consistent order
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
