class Solution {
    public int countNegatives(int[][] grid) {
        int c = 0;
        int i,j;
        for(i = 0; i < grid.length; i++)
        {
            for(j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] < 0)
                    c++;
            }
        }
        return c;
    }
}