class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        long tot = 0;;
        for(int i = n-1; i >= 0; i--)
        {
            tot = tot + (long)nums[i];
        }
        long min = Integer.MAX_VALUE;
        int pos = -1;
        long curr = 0;
        for(int i = 0; i < n; i++)
        {
            curr += nums[i];
            long avg1, avg2;
            int x = i+1;
            int y = n-x;
            avg1 = curr/x;
            if(i == n-1)
                avg2 = 0;
            else
                avg2 = (tot-curr)/y;
            long diff = (avg1 > avg2) ? (avg1-avg2) : (avg2-avg1);
            if(diff < min)
            {
                min = diff;
                pos = i;
            }
        }
        return pos;
    }
}