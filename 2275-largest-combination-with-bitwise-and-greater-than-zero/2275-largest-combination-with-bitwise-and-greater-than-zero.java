class Solution {
    public int largestCombination(int[] arr) {
        int l = 0, curr = 0;
        
        for(int i = 1; i <= 10000000; i<<=1)
        {
            curr = 0;
            for(int x: arr)
            {
                if((x & i) > 0)
                    curr++;
            }
            l = Math.max(l, curr);
        }
        return l;
    }
}