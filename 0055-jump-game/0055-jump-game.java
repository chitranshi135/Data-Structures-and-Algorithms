class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i = 0; i < n; i++)
        {
            if(i <= reach && (i+nums[i]) >= reach)
            {
                reach = i+nums[i];
            }
        }
        if(reach >= n-1)
            return true;
        return false;
    }
}