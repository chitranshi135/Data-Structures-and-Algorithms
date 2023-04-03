class Solution {
    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        long[] left = new long[n];
        Arrays.sort(beans);
        for(int i = 1; i < n; i++)
        {
            left[i] = left[i-1] + beans[i-1];
        }
        long right = 0;
        long min = Long.MAX_VALUE;
        for(int i = n-1; i >= 0; i--)
        {
            long c = left[i] + (right - (long)(beans[i]*(n-i-1L)));
            min = Math.min(min, c);
            right += beans[i];
        }
        return min;
    }
}