class Solution {
    
    public int maximalRectangle(char[][] matrix) {
        int maxArea=0;
        int prefixSum[][]=new int[matrix.length][matrix[0].length];
         for (int j= 0; j < matrix[0].length; j++) {
            int sum=0;
            for (int i = 0; i< matrix.length; i++) {
               
                if (matrix[i][j] == '1') {
                    sum+=1;
                    prefixSum[i][j]=sum;
                } else {
                    sum=0;
                    prefixSum[i][j]= 0;
                }
            }
         }
         
         for(int k=0;k<matrix.length;k++){
            maxArea = Math.max(maxArea, largestRectangleArea(prefixSum[k]));
    }
    return maxArea;
    }
         public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
      Stack<Integer> st=new Stack<>();
     for(int i=0;i<n;i++){
      while(!st.isEmpty() && heights[st.peek()]>heights[i] ){
        int element=st.peek();
        st.pop();
        int nse=i;
        int pse=st.isEmpty()?-1:st.peek();
        maxArea=Math.max(maxArea,(nse-pse-1)*heights[element]);
       
    }
     st.push(i);
}
while(!st.isEmpty()){
    int nse=n;
    int element=st.peek();
    st.pop();
    int pse=st.isEmpty()?-1:st.peek();
     maxArea=Math.max(maxArea,(nse-pse-1)*heights[element]);
}
//tc O(n)for 1 loop +O(n) for stack traversals sc O(n) for stack

        return maxArea;
    
    }
}