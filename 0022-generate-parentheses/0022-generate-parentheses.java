class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int[] brackets = {n, n};
        solve(brackets, "", ans, n);
        return ans;
    }
    
    public boolean isValid(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(')
                stack.push('(');
            else
            {
                if(stack.size() > 0)
                    stack.pop();
            }
        }
        return stack.size() == 0;
    }
    public void solve(int[] brackets, String curr, List<String> ans, int n)
    {
        if(curr.length() == 2*n)
        {
            //if(isValid(curr))
            ans.add(curr);
            return;
        }
        
        for(int i = 0; i < 2; i++)
        {
            if(brackets[i] > 0)
            {
                if(i == 0)
                {
                    if(brackets[1] >= brackets[0])
                    {
                        brackets[i]--;
                        solve(brackets, curr+"(", ans, n);
                        brackets[i]++;
                    }
                }
                else
                {
                    brackets[i]--;
                    solve(brackets, curr+")", ans, n);
                    brackets[i]++;
                }
            }
        }
    }
}