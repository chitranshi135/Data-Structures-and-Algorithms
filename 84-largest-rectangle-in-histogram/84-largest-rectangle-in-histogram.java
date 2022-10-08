class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] smallerLeft = new int[n];
        int[] smallerRight = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            if(stack.isEmpty())
                smallerLeft[i] = -1;
            else
                smallerLeft[i] = stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i = n-1; i >= 0; i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            if(stack.isEmpty())
                smallerRight[i] = n;
            else
                smallerRight[i] = stack.peek();
            stack.push(i);
        }
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int h = heights[i];
            int b = smallerRight[i] - smallerLeft[i] - 1;
            max = Math.max(h*b, max);
        }
        return max;
    }
}