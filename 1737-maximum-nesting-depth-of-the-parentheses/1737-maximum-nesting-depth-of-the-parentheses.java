class Solution {
    public int maxDepth(String s) {

        int n=s.length();

        Stack<Character> stack=new Stack<>();

        int max=0;

        for(int i=0; i<n; i++){

            if(s.charAt(i)=='('){
                stack.push('(');
                max=Math.max(max, stack.size());
            }else if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
        }

        return max;
        
    }
}