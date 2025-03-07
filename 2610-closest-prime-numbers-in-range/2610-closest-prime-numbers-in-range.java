class Solution {
   public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <=1 are not prime
        if (n <= 3) return true; // 2 and 3 are prime

        if (n % 2 == 0 || n % 3 == 0) return false; // Eliminate multiples of 2 and 3

        // Check divisibility from 5 to √n, skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isPrime(i)){
               arr.add(i);
            }
        }
        Integer[] list = arr.toArray(new Integer[0]);
        int n=list.length;
        int min=Integer.MAX_VALUE;
        int [] ans={-1, -1};
        if(n<=1){
            return ans;
        }
        for(int i=0; i+1<n; i++){
          int m=list[i+1]-list[i];
          if(min>m){
            min=m;
            ans[0]= list[i];
            ans[1]=list[i+1];
          }
        }
        return ans;
    }
}