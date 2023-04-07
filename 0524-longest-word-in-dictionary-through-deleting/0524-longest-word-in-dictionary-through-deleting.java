class Solution {
    public String findLongestWord(String s, List<String> dict) {
        String res = "";
        for(String w: dict)
        {
            if((w.length() < res.length()) || (w.length() == res.length() && w.compareTo(res) > 0))
                continue;
            int i = 0, j = 0;
            while(i < w.length() && j < s.length())
            {
                if(w.charAt(i) == s.charAt(j))
                {
                    i++;
                    j++;
                }
                else
                    j++;
            }
            if(i == w.length())
                res = w;;
        }
        return res;
    }
}