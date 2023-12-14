class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] row1 = new int[m];
        int[] col1 = new int[n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    row1[i]++;
                    col1[j]++;
                }
            }
        }
        
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = row1[i] + col1[j] - (n - row1[i]) - (m - col1[j]);
            }
        }
        return ans;
    }
}