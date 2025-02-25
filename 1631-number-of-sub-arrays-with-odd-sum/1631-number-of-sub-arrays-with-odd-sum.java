class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int n = arr.length;
        int mod = 1000000000 + 7;
        int sum=0;
        int odd=0;
        int even=1;
        for (int i = 0; i < n; i++) {
          sum+=arr[i];

          if(sum%2==1){
            count=(count+even)%mod;
            odd++;
          }
          else{
           count=(count+odd)%mod;
            even++;
          }

        }
        return count;
    }
}
