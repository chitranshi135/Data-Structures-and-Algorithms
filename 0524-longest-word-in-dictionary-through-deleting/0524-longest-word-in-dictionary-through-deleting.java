class Solution {
    public String findLongestWord(String s, List<String> dict) {
        dict.sort((a,b)->(a.length()==b.length())?a.compareTo(b):b.length()-a.length());
        for(String w: dict)
        {
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
                return w;
        }
        return "";
    }
}