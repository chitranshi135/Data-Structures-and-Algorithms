class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int i;
        int r = 0, c = 0, m = matrix.length-1, n = matrix[0].length-1;
        while(r <= m && c <= n)
        {
            for(i = c; i <= n; i++)
                list.add(matrix[r][i]);
            r++;
            for(i = r; i <= m; i++)
                list.add(matrix[i][n]);
            n--;
            for(i = n; i >= c && r <= m; i--)
                list.add(matrix[m][i]);
            m--;
            for(i = m; i >= r && c <= n; i--)
                list.add(matrix[i][c]);
            c++;
        }
        return list;
    }
}