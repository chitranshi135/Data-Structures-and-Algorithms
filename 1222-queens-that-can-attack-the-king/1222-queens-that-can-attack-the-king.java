class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] chessboard = new int[8][8];
        for(int[] q : queens){
            chessboard[q[0]][q[1]] = 1;
        }
        //top
        int i = king[0], j = king[1];
        while(i >= 0){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i--;
        }
        //down
        i = king[0]; j = king[1];
        while(i < 8){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i++;
        }
        //left
        i = king[0]; j = king[1];
        while(j >= 0){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            j--;
        }
        //right
        i = king[0]; j = king[1];
        while(j < 8){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            j++;
        }
        //left-top
        i = king[0]; j = king[1];
        while(i >= 0 && j >= 0){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i--; j--;
        }
        //left-down
        i = king[0]; j = king[1];
        while(i < 8 && j >= 0){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i++; j--;
        }
        //right-top
        i = king[0]; j = king[1];
        while(i >= 0 && j < 8){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i--; j++;
        }
        //right-down
        i = king[0]; j = king[1];
        while(i < 8 && j < 8){
            if(chessboard[i][j] == 1) {
                ans.add(List.of(i, j));
                break;
            }
            i++; j++;
        }
        return ans;
    }
    
}