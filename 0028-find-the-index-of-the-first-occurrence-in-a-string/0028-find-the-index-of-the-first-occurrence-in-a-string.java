class Solution {
    public int strStr(String haystack, String needle) {
        
        int l=0;
        int r=needle.length()-1;

        while(r<haystack.length()){
            if(needle.equals(haystack.substring(l, r+1))){
                return l;
            }
            l++;
            r++;
        }

        return -1;
    }
}