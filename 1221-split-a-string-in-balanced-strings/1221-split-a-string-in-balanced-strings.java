class Solution {
    public int balancedStringSplit(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = 0;
        int count = 0;
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] == 'R')
                r++;
            else
                l++;
            
            if(l == r)
            {
                count++;
                l = 0;
                r = 0;
            }
        }
        return count;
    }
}