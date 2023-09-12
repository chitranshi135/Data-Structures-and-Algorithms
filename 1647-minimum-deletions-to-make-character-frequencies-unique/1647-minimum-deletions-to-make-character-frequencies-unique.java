class Solution {
    public int minDeletions(String s) {
        int[] f = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            f[s.charAt(i)-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int del = 0;
        for(int i = 0; i < 26; i++)
        {
            while(f[i] > 0 && set.contains(f[i]))
            {
                f[i]--;
                del++;
            }
            if(f[i] > 0)
                set.add(f[i]);
        }
        return del;
    }
}