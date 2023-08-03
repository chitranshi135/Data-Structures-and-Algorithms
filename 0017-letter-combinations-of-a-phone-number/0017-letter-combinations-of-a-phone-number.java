class Solution {
    final String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        combine("", digits, 0, ans);
        return ans;
    }
    
    public void combine(String prefix, String digits, int idx, List<String> ans) {
        if(idx >= digits.length())
        {
            ans.add(prefix);
            return;
        }
        String chars = comb[digits.charAt(idx)-'0'];
        for(int i = 0; i < chars.length(); i++)
        {
            combine(prefix+chars.charAt(i), digits, idx+1, ans);
        }
    }

}