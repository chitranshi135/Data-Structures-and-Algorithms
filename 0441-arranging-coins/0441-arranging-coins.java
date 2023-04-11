class Solution {
    public int arrangeCoins(int n) {
        //all possible values of number of rows
        int start = 0, end = n;
        while(start <= end)
        {
            int k = start + (end-start)/2;
            long c = (long)k*(k+1)/2;
            if(c == n)
                return k;
            else if(c > n)
                end = k-1;
            else
                start = k+1;
        }
        return end;
    }
}