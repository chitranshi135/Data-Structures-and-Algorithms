class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {
                if (grid[i][j] > 0) 
                {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        int val = grid[i][j];
        grid[i][j] = 0;
        int v1 = dfs(grid, i-1, j);
        int v2 = dfs(grid, i+1, j);
        int v3 = dfs(grid, i, j-1);
        int v4 = dfs(grid, i, j+1);
        grid[i][j] = val;
        return val + Math.max(v1, Math.max(v2, Math.max(v3, v4)));
    }
}