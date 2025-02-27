class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> map=new HashSet<>();
        int n=arr.length;
        for(int i=0; i<n; i++){
            map.add(arr[i]);
        }
        int maxCount=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int curr=arr[j];
                int prev=arr[i];
                int count=2;
                while(map.contains(curr+prev)){
                   count++;
                   maxCount=Math.max(maxCount, count);
                   int temp=curr;
                   curr=curr+prev;
                   prev=temp;
                }
            }
        }

        return maxCount;
    }
}