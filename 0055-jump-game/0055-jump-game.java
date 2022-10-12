class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int last = n-1;
        for(int i = n-1; i >= 0; i--)
        {
            if(i+nums[i] >= last)
            {
                last = i;
            }
        }
        if(last == 0)
            return true;
        return false;
    }
}