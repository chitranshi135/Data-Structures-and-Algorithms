class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        boolean[] leftRow = new boolean[n];
        boolean[] upperDiag = new boolean[2*n-1];
        boolean[] lowerDiag = new boolean[2*n-1];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                board[i][j] = '.';
        }
        
        solve(n, 0, board, ans, leftRow, upperDiag, lowerDiag);
        return ans;
    }
    
    public void solve(int n, int col, char[][] board, List<List<String>> ans, boolean[] leftRow, boolean[] upperDiag, boolean[] lowerDiag){
        if(col == n)
        {
            List<String> temp = construct(board);
            ans.add(temp);
            return;
        }
        
        for(int row = 0; row < n; row++)
        {
            if(!leftRow[row] && !lowerDiag[row+col] && !upperDiag[(n-1-row)+col])
            {
                board[row][col] = 'Q';
                leftRow[row] = true;
                lowerDiag[row+col] = true;
                upperDiag[(n-1-row)+col] = true;
                solve(n, col+1, board, ans, leftRow, upperDiag, lowerDiag);
                
                board[row][col] = '.';
                leftRow[row] = false;
                lowerDiag[row+col] = false;
                upperDiag[(n-1-row)+col] = false;
            }
        }
    }
    
    public List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}