class Solution {
    public int reverse(int x) {
        int n=x;

        long rev=0;
        while(n!=0){
            long digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }


        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}