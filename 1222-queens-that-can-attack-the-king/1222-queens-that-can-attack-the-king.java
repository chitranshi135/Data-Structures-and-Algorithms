class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> list = new ArrayList<>();
        int[][] chessboard = new int[8][8];
        for(int[] q : queens){
            chessboard[q[0]][q[1]] = 1;
        }
        for(int i = -1; i <= 1; i++)
        {
            for(int j = -1; j <= 1; j++)
            {
                if(i == 0 && j == 0)
                    continue;
                int x = king[0], y = king[1];
                 while (x + i >= 0 && x + i < 8 && y + j >= 0 && y + j < 8) {
                    x += i;
                    y += j;
                    if (chessboard[x][y] == 1) {
                        list.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        }
        return list;
    }
    
}