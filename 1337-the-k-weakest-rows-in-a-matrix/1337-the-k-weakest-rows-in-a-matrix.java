class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int m = mat.length;
        int n = mat[0].length;
        int[][] arr = new int[m][n];
        int x,y;
        int c = 0;
        for(x =0; x < m; x++)
        {
            c = 0;
            for(y = 0; y < n; y++)
            {
                c += mat[x][y];
            }
            arr[x][0] = c;
            arr[x][1] = x;
        }
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        int[] row = new int[k];
        for(x = 0; x < k; x++)
        {
            row[x] = arr[x][1];
        }
        return row;
    }
}