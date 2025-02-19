class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int []nse=new int[n];
         int []pse=new int[n];
         int mod = 1_000_000_007;

         Stack<Integer> stack=new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
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
        Stack<Integer> stack1=new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack1.isEmpty() && arr[stack1.peek()]>arr[i]){
                stack1.pop();
            }
            if(!stack1.isEmpty()){
                pse[i]=stack1.peek();
            }
            else{
                pse[i]=-1;
            }
            stack1.push(i);
        }
        long total=0;
        for(int i=0; i<n; i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            
            total=(total+(left*right*arr[i])% mod)% mod;
            
        }
        return (int) total;
      
    }
}