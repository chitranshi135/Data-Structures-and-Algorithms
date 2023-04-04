class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        char[] c = num.toCharArray();
        int max = -1;
        String ans = "";
        for(int i = 1; i < n-1; i++)
        {
            if(c[i-1] == c[i] && c[i] == c[i+1])
            {
                int d = c[i]-'0';
                if(d > max)
                {
                    max = d;
                    ans = ""+c[i]+c[i]+c[i];
                }
                i++;
            }
        }
        if(max == -1)
            return "";
        return ans;
    }
}