class Solution {
    public String greatestLetter(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for(char ch : s.toCharArray())
        {
            if(ch >= 'a' && ch <= 'z')
                lower[ch-'a'] = true;
            else
                upper[ch-'A'] = true;
        }
        for(int i = 25; i >= 0; i--)
        {
            if(lower[i] && upper[i])
                return ""+(char)('A'+i);
        }
        return "";
    }
}