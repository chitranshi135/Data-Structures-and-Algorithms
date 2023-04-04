class Solution {
    public int alternateDigitSum(int num) {
        char[] c = (String.valueOf(num)).toCharArray();
        int s = 0;
        int n = c.length;
        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
                s += c[i]-'0';
            else
                s -= c[i]-'0';
        }
        return s;
    }
}