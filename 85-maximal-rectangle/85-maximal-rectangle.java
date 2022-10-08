class Solution {
    public int maximalRectangle(char[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] poss = new int[n];
        int max = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(mat[i][j] == '1')
                    poss[j] += 1;
                else
                    poss[j] = 0;
            }
            int[] smallerLeft = new int[n];
            int[] smallerRight = new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int x = 0; x < n; x++)
            {
                while(!stack.isEmpty() && poss[stack.peek()] >= poss[x])
                    stack.pop();
                if(stack.isEmpty())
                    smallerLeft[x] = -1;
                else
                    smallerLeft[x] = stack.peek();
                stack.push(x);
            }
            stack.clear();
            for(int x = n-1; x >= 0; x--)
            {
                while(!stack.isEmpty() && poss[stack.peek()] >= poss[x])
                    stack.pop();
                if(stack.isEmpty())
                    smallerRight[x] = n;
                else
                    smallerRight[x] = stack.peek();
                stack.push(x);
            }
            for(int x = 0; x < n; x++)
            {
                int h = poss[x];
                int b = smallerRight[x] - smallerLeft[x] - 1;
                max = Math.max(h*b, max);
            }
        }
        return max;
    }
}