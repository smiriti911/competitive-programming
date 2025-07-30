class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }

        int rev=0;
        int y=x;

        while(y!=0){
            int digit=y%10;

            rev= rev*10+digit;

            y=y/10;
        }

        if(rev==x){
            return true;
        }

        return false;
    }
}