class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0)
            return new ArrayList<>();
        String[] comb = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        
        combine(ans, digits.toCharArray(), "", comb);
        return ans;
    }
    
    public void combine(List<String> ans, char[] digits, String prefix, String[] comb) {
        if(prefix.length() == digits.length)
        {
            ans.add(prefix);
            return;
        }
        int idx = prefix.length();
        int digit = digits[idx]-'0';
        for(char ch : comb[digit].toCharArray())
        {
            combine(ans, digits, prefix+Character.toString(ch), comb);
        }
    }

}