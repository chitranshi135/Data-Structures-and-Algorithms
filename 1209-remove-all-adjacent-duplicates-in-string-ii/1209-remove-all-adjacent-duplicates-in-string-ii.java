class Pair
{
    int f;
    char ch;
    Pair(char ch, int f)
    {
        this.ch = ch;
        this.f = f;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek().ch == c)
            {
                int freq = stack.pop().f;
                if(freq+1 < k)
                    stack.push(new Pair(c, freq+1));
            }
            else
            {
                stack.push(new Pair(c, 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            int count = stack.peek().f;
            char c = stack.pop().ch;
            while(count-- > 0)
            {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}