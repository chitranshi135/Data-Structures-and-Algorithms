class Solution {
    public String smallestNumber(String p) {
        int c = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < p.length(); i++)
        {
            char ch = p.charAt(i);
            if(ch == 'I')
            {
                String w = String.valueOf(c++);
                while(!stack.isEmpty())
                {
                    w = String.valueOf(c) + w;
                    stack.pop();
                    c++;
                }
                sb.append(w);  
            }
            else
            {
                stack.push(-1);
            }
        }
        if(p.charAt(p.length()-1) == 'I')
            sb.append(String.valueOf(c));
        else
        {
            stack.push(-1);
            String w = "";
            while(!stack.isEmpty())
            {
                w = String.valueOf(c) + w;
                stack.pop();
                c++;
            }
            sb.append(w); 
        }
        return sb.toString();
    }
}