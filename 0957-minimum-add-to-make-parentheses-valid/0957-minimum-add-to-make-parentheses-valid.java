class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack=new Stack<>();

        int n=s.length();

       for(int i=0; i<n; i++){

            if(s.charAt(i)=='('){
                stack.push('(');
              
            
            }else if(!stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else{
                stack.push(')');
            }
        }

        return stack.size();
        
    }
}