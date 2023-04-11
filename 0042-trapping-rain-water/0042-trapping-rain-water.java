class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxRight = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--)
        {
            maxRight[i] = Math.max(maxRight[i+1], height[i]);
        }
        int w = 0;
        int maxLeft = 0;
        for(int i = 0; i < n; i++)
        {
            maxLeft = Math.max(maxLeft, height[i]);
            int l = Math.min(maxLeft, maxRight[i]);
            w += (l-height[i]);
        }
        return w;
    }
}