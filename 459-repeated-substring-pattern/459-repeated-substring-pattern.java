class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int i = l/2; i >= 1; i--)
        {
            if(l % i == 0)
            {
                int n = l/i;
                String part = s.substring(0, i);
                String nstr = part;
                for(int x = 2; x <= n; x++)
                    nstr += part;
                if(nstr.equals(s))
                    return true;
            }
        }
        return false;
    }
}