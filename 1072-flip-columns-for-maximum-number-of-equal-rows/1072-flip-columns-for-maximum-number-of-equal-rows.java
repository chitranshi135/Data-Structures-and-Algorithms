class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        for(int i = 0; i < m; i++)
        {
            int c = 1;
            int[] rev = new int[n];
            for(int j = 0; j < n; j++)
                rev[j] = 1 - matrix[i][j];
            for(int k = i+1; k < m; k++)
            {
                if(Arrays.equals(matrix[i], matrix[k]) || Arrays.equals(matrix[k], rev))
                    c++;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}