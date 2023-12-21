class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for(int j = 0; j < n; j++){
                if(matrix[i][j] >= 1 && matrix[i][j] <= n)
                    row.add(matrix[i][j]);
                if(matrix[j][i] >= 1 && matrix[j][i] <= n)
                    col.add(matrix[j][i]);
            }
            if(row.size() < n || col.size() < n)
                return false;
        }
        return true;
    }
}