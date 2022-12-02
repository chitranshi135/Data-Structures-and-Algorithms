class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        if(word1.length() != word2.length())
            return false;
        int n = word1.length();
        // Order of characters doesn't matter because rule 1 allows reordering
        //so we just need to observe frequencies
        for(int i = 0; i < n; i++)
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            f1[ch1-'a']++;
            f2[ch2-'a']++;
        }
        for(int i = 0; i < 26; i++)
        {
            //checking if the unique characters in both strings are same
            //since no new chracaters can be intriduced in any word
            if((f1[i] > 0 && f2[i] == 0) || (f1[i] == 0 && f2[i] > 0))
            {
                return false;
            } 
        }
        Arrays.sort(f1);
        Arrays.sort(f2);
        //using the second operation, w ecan swap the frequencies of characters but no new frequency can be introduced
        //now we need to check that the exact same set of frequencies are present in both the words
        //because the swapping always happens in pairs
        for(int i = 0; i < 26; i++)
        {
            if(f1[i] != f2[i])
                return false;
        }
        return true;
    }
}