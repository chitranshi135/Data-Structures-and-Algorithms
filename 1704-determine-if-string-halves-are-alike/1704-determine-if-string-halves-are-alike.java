class Solution {
    public boolean halvesAreAlike(String s) {
        String vow = "aeiouAEIOU";
        int s1 = 0, s2 = 0;
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(i < n/2)
            {
                if(vow.indexOf(ch) >= 0)
                    s1++;
            }
            else
            {
                if(vow.indexOf(ch) >= 0)
                    s2++;
            }
        }
        return s1==s2;
    }
}