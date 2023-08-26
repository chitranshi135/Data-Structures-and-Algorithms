class Solution {
    public int findLongestChain(int[][] pairs) {
        //always add whose end is slower ensures more future additions
        Arrays.sort(pairs, (a,b)->a[1]-b[1]);
        int c = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i < pairs.length; i++)
        {
            if(pairs[i][0] > prev)
            {
                c++;
                prev = pairs[i][1];
            }
        }
        return c;
    }
}