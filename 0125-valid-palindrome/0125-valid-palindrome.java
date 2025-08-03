class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int l=0;
        int r=clean.length()-1;

        while(l<=r){
            if(clean.charAt(l)!=clean.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}