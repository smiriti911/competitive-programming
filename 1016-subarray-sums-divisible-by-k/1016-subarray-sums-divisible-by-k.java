import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize remainder 0 with count 1

        for (int n : nums) {
            currentSum += n;
            int remainder = (currentSum % k + k) % k; // Ensure non-negative remainder

            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
