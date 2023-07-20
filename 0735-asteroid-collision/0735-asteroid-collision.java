class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int x : asteroids)
        {
            while(!stack.isEmpty() && (stack.peek() >= 0 && x < 0))
            {
                int y = stack.pop();
                if(Math.abs(x) == Math.abs(y))
                {
                    x = 0;
                    break;
                }
                x = (Math.abs(x) > Math.abs(y)) ? x : y;
            }
            if(x != 0)
                stack.push(x);
        }
        int[] ans = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty())
        {
            ans[i--] = stack.pop();
        }
        return ans;
    }
}