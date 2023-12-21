class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int[] fr = new int[n+1];
            int[] fc = new int[n+1];
            
            for(int j=0;j<n;j++){
                fr[matrix[i][j]]++;
                fc[matrix[j][i]]++;
                if(fr[matrix[i][j]] > 1 || fc[matrix[j][i]] > 1)
                    return false;
            }
            
            for(int s=1;s<=n;s++){
                if(fr[s]!=1 || fc[s]!=1)
                    return false;
            }
        }
        return true;
    }
}