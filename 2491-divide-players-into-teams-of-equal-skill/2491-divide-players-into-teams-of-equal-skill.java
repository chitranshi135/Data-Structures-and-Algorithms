class Solution {
    public long dividePlayers(int[] skill) {
        long tot = 0;
        int n = skill.length;
        for(int i = 0; i < n; i++)
            tot += (long)skill[i];
        //skill for each team
        long val = tot/(n/2);
        Arrays.sort(skill);
        long c = 0;
        for(int i = 0; i < n/2; i++)
        {
            long rem = val-skill[i];
            if((long)skill[n-1-i] != rem)
                return -1;
            c += ((long)skill[i] * rem);
        }
        return c;
    }
}