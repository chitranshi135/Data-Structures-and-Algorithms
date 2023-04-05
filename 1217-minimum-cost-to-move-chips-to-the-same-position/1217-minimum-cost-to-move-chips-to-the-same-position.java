class Solution {
    public int minCostToMoveChips(int[] p) {
        int n = p.length;
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++)
        {
            if(p[i] % 2 == 0)
                even ++;
            else
                odd ++;
        }
        return Math.min(even, odd);
    }
}