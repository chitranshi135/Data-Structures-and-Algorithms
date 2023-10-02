class Solution {
    public boolean winnerOfGame(String colors) {
        int a = 0, b = 0;
        char[] c = colors.toCharArray();
        for(int i = 1; i < c.length-1; i++)
        {
            if(c[i] == c[i-1] && c[i] == c[i+1])
            {
                if(c[i] == 'A')
                    a++;
                else
                    b++;
            }
        }
        return a>b;
    }
}