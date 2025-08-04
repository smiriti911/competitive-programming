class Solution {
    public String longestPalindrome(String s) {
     int maxL = Integer.MIN_VALUE;
        String res="";
        for(int i=0;i<s.length();i++){
            //odd
            String odd = solve(s, i, i);
            String even = solve(s, i, i+1);
            if(odd.length()>maxL){
                maxL = odd.length();
                res = odd;
            }
            if(even.length()>maxL){
                maxL = even.length();
                res = even;
            }
        }
        return res;
    } 
    public String solve(String s, int i, int j){
        String res="";
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            res = s.substring(i,j+1);
            i--;
            j++;
        }
        return res;
    }
}