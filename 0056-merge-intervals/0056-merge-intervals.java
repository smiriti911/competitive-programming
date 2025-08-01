import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort by start

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If ans is not empty and current interval overlaps with last one in ans
            if (!ans.isEmpty() && start <= ans.get(ans.size() - 1)[1]) {
                // Merge intervals
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], end);
            } else {
                // No overlap, just add interval
                ans.add(new int[]{start, end});
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
