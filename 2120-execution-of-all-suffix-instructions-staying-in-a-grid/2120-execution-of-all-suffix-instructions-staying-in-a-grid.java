class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int l = s.length();
        int[] ans = new int[l];
        for(int i = 0; i < l; i++)
        {
            int count = 0;
            int r = startPos[0], c = startPos[1];
            for(int j = i; j < l; j++)
            {
                char ch = s.charAt(j);
                if(ch == 'L')
                    c--;
                else if(ch == 'R')
                    c++;
                else if(ch == 'U')
                    r--;
                else if(ch == 'D')
                    r++;
                
                if(r < 0 || c < 0 || r >= n || c >= n)
                    break;
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}