class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        if(n == 1)
            return mat[0][0];
        int ans = Integer.MAX_VALUE;
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
                if(i == n-1)
                    ans = Math.min(ans, mat[i][j]);
            }
        }
        return ans;
    }
}