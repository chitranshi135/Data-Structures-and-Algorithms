class Solution {
    public int maxSubarrays(int[] nums) {
        int count = 0;
        //it has all ones
        int res = -1;
        for(int i = 0; i < nums.length; i++)
        {
            res = res & nums[i];
            if(res == 0)
            {
                count++;
                res = -1;
            }
        }
        return Math.max(1, count);
    }
}