class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack <Character> stack =new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
            {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
} 