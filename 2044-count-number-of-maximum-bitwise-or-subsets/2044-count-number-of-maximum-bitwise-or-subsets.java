class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int[] maxOR = new int[1];
        int[] count = new int[1];
        solve(nums, 0, 0, maxOR, count);
        return count[0];
    }
    
    public void solve(int[] nums, int idx, int or, int[] maxOR, int[] count) {
        if(idx == nums.length)
        {
            if(or == maxOR[0])
                count[0]++;
            else if(or > maxOR[0])
            {
                count[0] = 1;
                maxOR[0] = or;
            }
            return;
        }
        //include
        solve(nums, idx+1, nums[idx] | or, maxOR, count);
        //exclude
        solve(nums, idx+1, or, maxOR, count);
    }
}