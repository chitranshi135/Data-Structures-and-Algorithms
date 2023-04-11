class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        //penalty can be in range 1 and 10^9
        int start = 1, end = 1_000_000_000;
        while(start < end)
        {
            //mid is the penalty, and to convert each into mid
            //(nums[i]-1)/mid operations are required
            int mid = start +  (end-start)/2;
            int c = 0;
            for(int n : nums)
            {
                c += (n-1)/mid;
            }
            if(c <= maxOperations)
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }
}