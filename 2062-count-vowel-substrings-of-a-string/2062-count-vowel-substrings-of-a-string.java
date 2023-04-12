class Solution {
    public int countVowelSubstrings(String word) {
        int[] f = new int[26];
        int i = 0, j = 0, m = 0;
        int count = 0;
        char[] c = word.toCharArray();
        int n = c.length;
        String vow = "aeiou";
        while(j < n)
        {
            if(vow.indexOf(c[j]) == -1)
            {
                i = j+1;
                m = i;
                f = new int[26];
            }
            else
            {
                f[c[j]-'a']++;
                while(f['a'-'a'] >= 1 && f['e'-'a'] >= 1 && f['i'-'a'] >= 1 && f['o'-'a'] >= 1 && f['u'-'a'] >= 1)
                {
                    f[c[m]-'a']--;
                    m++;
                }
                count += (m-i);
            }
            j++;
        }
        return count;
    }
}