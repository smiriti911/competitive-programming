import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 0;

        // Insert all elements into the Min-Heap as long values
        for (int num : nums) {
            pq.add((long) num);
        }

        // Process until the smallest element is >= k
        while (pq.size() > 1 && pq.peek() < k) {
            long min1 = pq.poll();
            long min2 = pq.poll();

            long newElement = min1*2 + (min2);
            pq.add(newElement);
            count++;
        }

        return count;
    }
}
