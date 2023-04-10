class Solution {
    public int binarySearch(int start, int end, int[] potions, int x, long success)
    {
        while(start < end)
        {
            int mid = start + (end-start)/2;
            long p = (long)x * (long)potions[mid];
            if(p < success)
                start = mid+1;
            else
                end = mid;
        }
        return start;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        Arrays.sort(potions);
        int[] pair = new int[n];
        for(int i = 0; i < n; i++)
        {
            int j = binarySearch(0, m, potions, spells[i], success);
            pair[i] = m-j;
        }
        return pair;
    }
}