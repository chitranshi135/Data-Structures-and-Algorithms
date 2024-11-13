class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return getPairs(upper, nums)-getPairs(lower-1, nums);
    }
    //gives pairs whose value is less than or equal to limit
    public long getPairs(int limit, int[] nums)
    {
        int n = nums.length;
        int j = n-1;
        long c = 0L;
        for(int i = 0; i < j; i++)
        {
            while(nums[i]+nums[j] > limit && i < j)
                j--;
            //for each i, j cab be from i+1 to j
            c += j-i;
        }
        return c;
    }
}