class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int turn = 1;
        String ans = "";
        while(i < word1.length() || j < word2.length())
        {
            if(turn % 2 == 1)
            {
                if(i < word1.length())
                    ans = ans + word1.charAt(i++);
                else
                    ans = ans + word2.charAt(j++);
            }
            else
            {
                if(j < word2.length())
                    ans = ans + word2.charAt(j++);
                else
                    ans = ans + word1.charAt(i++);
            }
            turn++;
        }
        return ans;
    }
}