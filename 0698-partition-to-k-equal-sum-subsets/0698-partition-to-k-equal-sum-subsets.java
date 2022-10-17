class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int tot = 0;
        for(int x : nums)
            tot += x;
        if(tot % k != 0)
            return false;
        int s = tot/k;
        boolean[] vis = new boolean[nums.length];
        Arrays.sort(nums);
        if(nums[nums.length-1] > s)
            return false;
        return dfs(nums, 0, s, nums.length-1, vis, k);
    }
    public boolean dfs(int[] nums, int curr, int target, int start, boolean[] vis, int k)
    {
        if(k == 0)
            return true;
        //subset is completed before reaching this element
        //so we start a new subset
        if(curr == target && dfs(nums, 0, target, nums.length-1, vis, k-1))
            return true;
        for(int i = start; i >= 0; i--)
        {
            if(!vis[i] && nums[i]+curr <= target)
            {
                vis[i] = true;
                if(dfs(nums, curr+nums[i], target, i-1, vis, k))
                    return true;
                vis[i] = false;
            }
        }
        return false;
    }
}