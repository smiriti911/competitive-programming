class Solution {
    public long subArrayRanges(int[] arr) {
        int n=arr.length;
        int [] nge=new int [n];
        int [] nse=new int [n];
        int [] pse=new int [n];
        int [] pge=new int [n];
        long totalMax=0;
        long totalMin=0;
        Stack <Integer> stack=new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]<= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nge[i]=stack.peek();
            }
            else{
                nge[i]=n;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            stack.pop();
        }
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]< arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                pge[i]=stack.peek();
            }
            else{
                pge[i]=-1;
            }
            stack.push(i);

            long left=i-pge[i];
            long right=nge[i]-i;
             
            totalMax+= left*right*arr[i];
            
        }
          while(!stack.isEmpty()){
            stack.pop();
        }

         for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
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
        while(!stack.isEmpty()){
            stack.pop();
        }
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                pse[i]=stack.peek();
            }
            else{
                pse[i]=-1;
            }
            stack.push(i);

            long left=i-pse[i];
            long right=nse[i]-i;
             
            totalMin+= left*right*arr[i];
            
        }

        return totalMax-totalMin;
    }
}