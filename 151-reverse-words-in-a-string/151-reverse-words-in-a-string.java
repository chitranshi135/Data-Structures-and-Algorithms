class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s += " ";
       String res = "";
       String w = "";
       for(int i = 0; i < s.length(); i++)
       {
            char ch = s.charAt(i);
            if(ch != ' ')
                w += ch;
            else
            {
                if(w.length() > 0)
                    res = w + " " + res;
                w = "";
            }
       }
       return res.trim();
    }
}