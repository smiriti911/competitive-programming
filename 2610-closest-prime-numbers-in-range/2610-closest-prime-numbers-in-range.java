class Solution {
   public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        if (n <= 3) return true; 

        if (n % 2 == 0 || n % 3 == 0) return false; 

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isPrime(i)){
               list.add(i);
            }
        }
    
        int n=list.size();
        int min=Integer.MAX_VALUE;
        int [] ans={-1, -1};
        if(n<=1){
            return ans;
        }
        for(int i=0; i+1<n; i++){
          int m=list.get(i+1)-list.get(i);
          if(min>m){
            min=m;
            ans[0]= list.get(i);
            ans[1]=list.get(i+1);
          }
        }
        return ans;
    }
}