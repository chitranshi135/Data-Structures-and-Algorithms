class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int prev = 0;
        int tot = 0;
        for(int i = 0; i < n; i++)
        {
            int c = 0;
            for(int j = 0; j < bank[i].length(); j++)
            {
                char ch = bank[i].charAt(j);
                if(ch == '1')
                    c++;
            }
            if(c > 0)
            {
                tot += prev*c;
                prev = c;
            }
        }
        return tot;
    }
}