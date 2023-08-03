class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return new ArrayList<>();
        String[] comb = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        
        combine(comb, "", digits.toCharArray(), ans);
        return ans;
    }
    
    public void combine(String[] comb, String prefix, char[] digits, List<String> ans) {
        if(prefix.length() == digits.length)
        {
            ans.add(prefix);
            return;
        }
        int idx = prefix.length();
        String chars = comb[digits[idx]-'0'];
        for(char ch : chars.toCharArray())
        {
            combine(comb, prefix+ch, digits, ans);
        }
    }

}