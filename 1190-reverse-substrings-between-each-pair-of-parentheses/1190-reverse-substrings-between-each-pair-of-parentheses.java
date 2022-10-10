class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ')')
            {
                String w = "";
                while(!stack.isEmpty() && stack.peek() != '(')
                    w = w + stack.pop();
                stack.pop();
                for(int j = 0; j < w.length(); j++)
                    stack.push(w.charAt(j));
            }
            else
                stack.push(ch);
        }
        String res = "";
        while(!stack.isEmpty())
            res = stack.pop() + res;
        return res;
    }
}