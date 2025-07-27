class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int l=0;
        int r=0;
        int [] hash= new int [3];
        while(r<s.length()){
            hash[s.charAt(r)-'a']++;

           while(hash[0]>0 && hash[1]>0 && hash[2]>0){
                count+=s.length()-r;
                hash[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return count;
    }
}