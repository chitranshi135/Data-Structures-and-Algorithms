class Solution {
    public boolean isValid(String x) {
        char[] c = x.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] == '{' || c[i] == '(' || c[i] == '[')
                stack.push(c[i]);
            else
            {
                if(stack.isEmpty())
                    return false;
                if(c[i] == '}')
                {
                    if(stack.peek() != '{')
                        return false;
                    else
                        stack.pop();
                }
                else if(c[i] == ')')
                {
                    if(stack.peek() != '(')
                        return false;
                    else
                        stack.pop();
                }
                else if(c[i] == ']')
                {
                    if(stack.peek() != '[')
                        return false;
                    else
                        stack.pop();
                }
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}