class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int total=0;
        int max=0;
         for (int i = 0; i < piles.length; i++) {
            total += piles[i];
            max = Math.max(max, piles[i]);
        }

        int start =1;
        int end = max;
        int ans = Integer.MAX_VALUE;
      
       while(start<=end){
        int mid=start+(end-start)/2;
        long hour=0;
         for(int i=0; i<piles.length; i++){
            if(piles[i]<mid){
               hour++;
            }
            if(piles[i]>=mid){
                if(piles[i]%mid==0){
                    hour+=piles[i]/mid;
                }else{
                    hour+=piles[i]/mid+1;
                }
            }
         }

        if(hour<=h){
            ans=Math.min(ans, mid);
            end=mid-1;
         }else{
            start=mid+1;
         }
       }
     return ans;
    }
}