class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.equals(goal)){
            return true;
        }

        int count=0;

        while(count<s.length()){
            char c = s.charAt(0);

            String newStr = s.substring(1) + c;

            if(newStr.equals(goal)){
                return true;
            }else{
                s=newStr;
            }

            count++;
        }

        return false;
    }
}