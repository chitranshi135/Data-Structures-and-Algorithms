class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for(int i = 0; i < tiles.length(); i++)
        {
            freq[tiles.charAt(i)-'A']++;
        }
        return solve(freq);
    }
    
    public int solve(int[] freq) {
        int sum = 0;
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] > 0)
            {
                //suppose sequence of a certain length ends with this character
                sum++;
                //take
                freq[i]--;
                sum += solve(freq);
                freq[i]++;
            }
        }
        return sum;
    }
}