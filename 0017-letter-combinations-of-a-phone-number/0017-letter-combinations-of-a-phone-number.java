class Solution {
    final String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        combine("", digits.toCharArray(), 0, ans);
        return ans;
    }
    
    public void combine(String prefix, char[] digits, int idx, List<String> ans) {
        if(idx == digits.length)
        {
            ans.add(prefix);
            return;
        }
        String chars = comb[digits[idx]-'0'];
        for(char ch : chars.toCharArray())
        {
            combine(prefix+ch, digits, idx+1, ans);
        }
    }

}