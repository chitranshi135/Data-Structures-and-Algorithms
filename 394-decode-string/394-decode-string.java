class Solution {
    public boolean isDigit(String a){
       return (a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("6")
       ||a.equals("7")||a.equals("8")||a.equals("9")||a.equals("0"));
    }
    public String decodeString(String s) {
        s = "1[" + s + "]";
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ']')
            {
                String part = "";
                while(!stack.isEmpty() && !stack.peek().equals("["))
                    part = stack.pop() + part;
                //pop opening bracket
                if(!stack.isEmpty())
                    stack.pop();
                String f = "";
                int freq = 0;
                while(!stack.isEmpty() && isDigit(stack.peek()))
                        f = stack.pop() + f;
                freq = Integer.parseInt(f);
                String str = "";
                while(freq-- > 0)
                {
                    str = str+part;
                }
                stack.push(str);
            }
            else
                stack.push(""+ch);
        }
        return stack.pop();
    }
}