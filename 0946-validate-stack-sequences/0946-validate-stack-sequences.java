class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int j = 0;
        for(int x : pushed)
        {
            stack.push(x);
            while(j < n && !stack.isEmpty() && stack.peek() == popped[j])
            {
                stack.pop();
                j++;
            }
        }
        if(j == n)
            return true;
        return false;
    }
}