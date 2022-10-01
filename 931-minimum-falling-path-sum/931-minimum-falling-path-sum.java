class Solution {
    int m, n;
    public int minFallingPathSum(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        int min = Integer.MAX_VALUE;
        for(int c = 0; c < n; c++)
        {
            min = Math.min(min, sum(mat, 0, c, dp));
        }
        return min;
    }
    public int sum(int[][] mat, int r, int c, int[][] dp)
    {
        if(c < 0 || c >= n)
            return 100000000;
        if(r >= m)
            return 0;
        if(dp[r][c] != -1)
            return dp[r][c];
        return  dp[r][c] = mat[r][c] + Math.min(sum(mat, r+1, c, dp), Math.min(sum(mat, r+1, c-1, dp), sum(mat, r+1, c+1, dp)));
    }
}