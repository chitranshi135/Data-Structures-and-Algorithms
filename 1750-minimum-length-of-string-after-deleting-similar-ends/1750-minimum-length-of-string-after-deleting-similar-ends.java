class Solution {
    public int minimumLength(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int n = c.length;
        int j = n-1;
        int r = 0;
        while(i < j)
        {
            if(c[i] != c[j])
                break;
            int l = 0;
            char ch = c[i];
            while(i < j && c[i] == ch)
            {
                i++;
                l++;
            }
            if(l > 0)
                i--;
            r += l;
            l = 0;
            while(j > i && c[j] == ch)
            {
                l++;
                j--;
            }
            if(l > 0)
                j++;
            r += l;
            i++;
            j--;
        }
        return n-r;
    }
}