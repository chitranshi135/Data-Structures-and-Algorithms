class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int minR = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++)
                {
                    if(k != j)
                    {
                        minR = Math.min(minR, mat[i-1][k]);
                    }
                }
                //stores min possible valid sum from top
                mat[i][j] += minR;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int x : mat[n-1])
        {
            ans = Math.min(ans, x);
        }
        return ans;
    }
}