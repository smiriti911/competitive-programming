class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        int max=Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i>=0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()){
                nse[i]=stack.peek();
            }
            else{
                nse[i]=n;
            }
            stack.push(i);
        }
         Stack<Integer> stack1 = new Stack<>();
         for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && arr[stack1.peek()] >= arr[i]) {
                stack1.pop();
            }
            if(!stack1.isEmpty()){
                pse[i]=stack1.peek();
            }
            else{
                pse[i]=-1;
            }
            stack1.push(i);
             int area= arr[i]*(nse[i]-pse[i]-1);
            max=Math.max(max, area);
        }


        return max;

    }
}