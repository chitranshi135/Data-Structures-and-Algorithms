class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
        }
        int before = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
        {
            ans[i] = (sum - before - ((n-i)*nums[i])) + ((i)*nums[i] - before);
            before += nums[i];
        }
        return ans;
    }
}