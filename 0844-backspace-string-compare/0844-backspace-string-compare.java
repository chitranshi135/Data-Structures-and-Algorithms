class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '#' && !stack.isEmpty())
                stack.pop();
            if(ch != '#')
                stack.push(ch);
        }
        s = "";
        while(!stack.isEmpty())
        {
            s = stack.pop() + s;
        }
        
        for(int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(ch == '#' && !stack.isEmpty())
                stack.pop();
            if(ch != '#')
                stack.push(ch);
        }
        t = "";
        while(!stack.isEmpty())
        {
            t = stack.pop() + t;
        }
        
        return s.equals(t);
    }
}