class Solution {
    public int longestPalindrome(String s) {
        int[] f = new int[26];
        int[] F = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                f[ch-'a']++;
            else
                F[ch-'A']++;
        }
        int l = 0;
        int odd = 0;
        for(int i = 0; i < 26; i++)
        {
            int c = f[i]/2;
            int C = F[i]/2;
            if(f[i] % 2 == 1 || F[i] % 2 == 1)
                odd++;
            l += (c*2)+(C*2);
        }
        if(odd > 0)
            l++;
        return l;
    }
}