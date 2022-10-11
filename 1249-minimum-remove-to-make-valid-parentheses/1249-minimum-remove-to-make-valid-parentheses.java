class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ')')
            {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                    stack.pop();
                else
                    stack.push(i);
            }
            else if(ch == '(')
                stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == i)
            {
                stack.pop();
            }
            else
            {
                sb.append(ch);
            }
        }
        return (sb.reverse()).toString();
    }
}