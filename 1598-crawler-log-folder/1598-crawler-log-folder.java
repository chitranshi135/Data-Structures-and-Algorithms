class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            if(logs[i].equals("./"))
                continue;
            else if(logs[i].equals("../"))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(logs[i]);
        }
        return stack.size();
    }
}