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
            while(j >= i && c[j] == ch)
            {
                l++;
                j--;
            }
            r += l;
        }
        return n-r;
    }
}