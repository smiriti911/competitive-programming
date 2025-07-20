class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0){
        return 0;
       }
       if(s.length()==1){
        return 1;
       }
       int max=Integer.MIN_VALUE;

       for(int i=0; i<s.length(); i++){
        Set <Character> set=new HashSet<>();
        for(int j=i; j<s.length(); j++){
            if(set.contains(s.charAt(j))){
                max=Math.max(max, j-i);
                break;
            }
            set.add(s.charAt(j));
        }

          // In case the inner loop goes to the end without duplicate
            max = Math.max(max, set.size());
       }

       return max;
    }
}