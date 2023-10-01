class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board){
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] == '.')
                {
                    for(char v = '1'; v <= '9'; v++)
                    {
                        if(isValid(board, i, j, v))
                        {
                            board[i][j] = v;
                            if(solve(board))
                                return true;
                            
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int i, int j, char v){
        for(int x = 0; x < 9; x++)
        {
            if(board[i][x] == v)
                return false;
            
            if(board[x][j] == v)
                return false;
            
            int r = 3 * (i/3) + x/3;
            int c = 3 * (j/3) + x%3;
            
            if(board[r][c] == v)
                return false;
        }
        return true;
    }
}