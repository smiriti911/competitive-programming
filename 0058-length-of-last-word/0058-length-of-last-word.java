class Solution {
    public int lengthOfLastWord(String s) {
        String [] words=s.split(" ");

        String last=words[words.length-1];
        int count=0;
        for(int i=0; i<last.length(); i++){
           count++;
        }
        return count;
    }
}