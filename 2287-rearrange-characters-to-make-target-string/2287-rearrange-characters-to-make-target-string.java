class Solution {
    public int rearrangeCharacters(String s, String t) {
        int[] fs = new int[26];
        int[] ft = new int[26];
        for(char ch : s.toCharArray())
        {
            fs[ch-'a']++;
        }
        for(char ch : t.toCharArray())
        {
            ft[ch-'a']++;
        }
        int m = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++)
        {
            if(ft[i] == 0)
                continue;
            if(ft[i] > fs[i])
                return 0;
            int c = fs[i]/ft[i];
            m = Math.min(m, c);
        }
        return m;
    }
}