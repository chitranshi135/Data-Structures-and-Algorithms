class Solution {
    public int minimumSum(int num) {
        char[] c = (String.valueOf(num)).toCharArray();
        int n = c.length;
        Arrays.sort(c);
        int s1 = 0, s2 = 0;
        for(int i = 0; i < n; i++)
        {
            s1 = s1*10 + (c[i]-'0');
            if(i+1 < n)
                s2 = s2*10 + (c[i+1]-'0');
            i++;
        }
        return s1+s2;
    }
}