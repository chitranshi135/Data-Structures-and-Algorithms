class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int n = tokens.length;
        Arrays.sort(tokens);
        int i = 0, j = n-1;
        while(i <= j)
        {
            if(power >= tokens[i])
            {
                power -= tokens[i];
                score++;
                i++;
            }
            else 
            {
                if(i < j && score >= 1)
                {
                    score--;
                    power += tokens[j];
                }
                j--;
            }
        }
        return score;
    }
}