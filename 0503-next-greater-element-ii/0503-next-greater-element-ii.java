class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[nums.length];
        for (int i = 2*nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i%nums.length]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nge[i%nums.length] = stack.peek();
            } else {
                nge[i%nums.length] = -1;
            }
            stack.push(nums[i%nums.length]);
        }

        return nge;
    }
}