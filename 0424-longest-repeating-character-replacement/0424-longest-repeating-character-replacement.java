class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxF = 0;
        int l=0;
        int r=0;

        int maxLen = 0;
         
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;

            maxF= Math.max(maxF, freq[s.charAt(r)-'A']);

            int changes=(r-l+1)-maxF;

            while(changes>k){
                freq[s.charAt(l)-'A']--;
                l++;
                changes = (r - l + 1) - maxF;
            }

            if(changes<=k){
                maxLen=Math.max(maxLen, r-l+1);
            }

            r++;
        }

        return maxLen;
    }
}