class Solution {
    public int reverse(int x) {
        int n=x;
         boolean negative =false;
        if(n<0){
            n*=-1;

            negative =true;
        }
        long rev=0;
        while(n!=0){
            long digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }

        if(negative){
            rev*=-1;
        }

        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}