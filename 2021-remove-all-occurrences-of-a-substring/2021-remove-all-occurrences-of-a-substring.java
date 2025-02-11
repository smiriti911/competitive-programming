class Solution {
    public String removeOccurrences(String s, String part) {
        int index= s.indexOf(part);
        int n= part.length();
        if(index==-1){
            return s;
        }
        else{
            return removeOccurrences((s.substring(0,index)+s.substring(index+n)),part);
        }
    }
}