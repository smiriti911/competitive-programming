class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int ans=0;
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int n= nums.length-k+1;
        for(int i=0; i<n; i++){
           ans=pq.poll();
        }

        return ans;
    }
}