class Solution {
    boolean flag = true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for (int i = 0; i < grid2.length; i++) 
        {
            for (int j = 0; j < grid2[0].length; j++) 
            {
                if (grid2[i][j] == 1 && grid1[i][j] == 1) 
                {
                    flag = true;
                    dfs(grid2, grid1, i, j);
                    if(flag)
                        count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid2, int[][] grid1, int i, int j)
    {
        //check if further dfs is possible in grid 2 but nt in grid1 at any stage
        if(i < 0 || j < 0 || i >= grid2.length || j >= grid2[0].length || grid2[i][j] == 0)
            return;
        if(grid1[i][j] == 0)
            flag = false;
        grid2[i][j] = 0;
        dfs(grid2, grid1, i-1, j);
        dfs(grid2, grid1, i+1, j);
        dfs(grid2, grid1, i, j-1);
        dfs(grid2, grid1, i, j+1);
    }
}