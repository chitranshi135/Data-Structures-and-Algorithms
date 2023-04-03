class Solution {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        long tot = 0;
        Arrays.sort(beans);
        for(int i = 0; i < n; i++)
            tot += beans[i];
        long right = 0;
        long left = 0;
        long min = Long.MAX_VALUE;
        for(int i = n-1; i >= 0; i--)
        {
            left = tot - beans[i] - right;
            long c = left + (right - (long)(beans[i]*(n-i-1L)));
            min = Math.min(min, c);
            right += beans[i];
        }
        return min;
    }
}