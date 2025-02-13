class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long p=n;
        if(n==0){
            return 1;
        }if(n<0){
            x=1/x;
            p=-p;
        }
        while(p>0){
            if(p%2==1){
                ans*=x;
            }
            x*=x;
            p/=2;
        }
        return ans;
    }
}