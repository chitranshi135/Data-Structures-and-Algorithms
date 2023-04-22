class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] city = new int[n];
        for(int[] r : roads)
        {
            city[r[0]]++;
            city[r[1]]++;
        }
        Arrays.sort(city);
        long s = 0;
        long v = n;
        for(int i = n-1; i >= 0; i--)
        {
            s += (v*(long)city[i]);
            v--;
        }
        return s;
    }
}