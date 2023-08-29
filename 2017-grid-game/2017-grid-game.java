class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        //path remaining can include the rem values in row0 or row1
        //because all the rest is zero
        //wisest choice is to have as many non zero elements
        long row0 = 0;
        for(int i = 0; i < n; i++)
            row0 += grid[0][i];
        
        long row1 = 0;
        long min = Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            //this will become 0 if robot1 moves to row1 from this index
            //value in row1 to the right of changing index
            row0 -= grid[0][i];
            //robot2 will choose the best path for itself
            long path2 = Math.max(row0, row1);
            //we have minimize the value of best path for robot2
            min = Math.min(min, path2);
            //value in row1 to the left of changing index
            row1 += grid[1][i];
        }
        return min;
    }
}