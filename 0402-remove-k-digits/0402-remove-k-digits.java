class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            while(k > 0 && !stack.isEmpty() && stack.peek() > ch)
            {
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && ch == '0')
                continue;
            stack.push(ch);
        }
        while(!stack.isEmpty() && k > 0)
        {
            stack.pop();
            k--;
        }
        if(stack.isEmpty())
            return "0";
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        return (sb.reverse()).toString();
    }
}