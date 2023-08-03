class Solution {
    public List<String> letterCombinations(String digits) {
        String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        combine(comb, "", digits.toCharArray(), 0, ans);
        return ans;
    }
    
    public void combine(String[] comb, String prefix, char[] digits, int idx, List<String> ans) {
        if(idx == digits.length)
        {
            ans.add(prefix);
            return;
        }
        String chars = comb[digits[idx]-'0'];
        for(char ch : chars.toCharArray())
        {
            combine(comb, prefix+ch, digits, idx+1, ans);
        }
    }

}