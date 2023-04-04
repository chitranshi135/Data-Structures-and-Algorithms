class Solution {
    public int minimumMoves(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int move = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 'X')
            {
                move++;
                i += 2;
            }
        }
        return move;
    }
}