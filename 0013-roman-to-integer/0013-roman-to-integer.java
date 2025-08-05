class Solution {
    public int romanToInt(String s) {
        int sum=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            char cur=s.charAt(i);
            int curr=0;
            if(cur=='I'){
                curr= 1;
            }
            if(cur=='V'){
                curr= 5;
            }
            if(cur=='X'){
                curr= 10;
            }
            if(cur=='L'){
                curr= 50;
            }
            if(cur=='C'){
                curr= 100;
            }
            if(cur=='D'){
                curr= 500;
            }
            if(cur=='M'){
                curr= 1000;
            }
            if(curr<prev){
                sum-=curr;
            }else{
                sum+=curr;
            }
            prev=curr;
        }
        return sum;
    }
}