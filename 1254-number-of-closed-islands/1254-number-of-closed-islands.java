class Solution {
    boolean flag = true;
    public int closedIsland(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) 
        {
            for (int j = 0; j < grid[0].length; j++) 
            {
                if (grid[i][j] == 0) 
                {
                    flag = true;
                    dfs(grid, i, j);
                    if(flag)
                        count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
        {
            flag = false;
            return;
        }
        if(grid[i][j] == 1)
            return;
        grid[i][j] = 1;
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}