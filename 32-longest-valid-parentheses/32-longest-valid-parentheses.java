class Solution {
    public int longestValidParentheses(String s) {
        //stores problematic indexes
        Stack<Integer> stack = new Stack<>();
        //this handles if there is extra closing bracket
        stack.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                stack.push(i);
            else
            {
                stack.pop();
                if(!stack.isEmpty())
                {
                    max = Math.max(max, i-stack.peek());
                }
                //means there was no opening bracket
                //so now we have to push index of this closing bracket
                //as this is problematic index
                else
                {
                    stack.push(i);
                }
            }
        }
        return max;
    }
}