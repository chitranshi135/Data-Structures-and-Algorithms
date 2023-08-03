class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length() == 0)
            return ans;
        ans.add("");
        for(int i = 0; i < digits.length(); i++)
        {
            int j = digits.charAt(i)-'0';
            ans = combine(ans, comb[j]);
        }
        return ans;
    }
    
    public List<String> combine(List<String> ans, String chars) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < chars.length(); i++)
        {
            char ch = chars.charAt(i);
            for(String s : ans)
            {
                list.add(s+ch);
            }
        }
        return list;
    }

}