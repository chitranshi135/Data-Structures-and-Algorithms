class Solution {
    int[][] dp;
    int mod = 1000000007;
    int max;
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[n+1][target+1];
        max = k;
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return helper(n, target);
    }
    public int helper(int n, int target)
    {
        if(n == 0 && target == 0)
            return 1;
        if(n == 0 || target < 0)
            return 0;
        if(dp[n][target] == -1)
        {
            int count = 0;
            for(int i = 1; i <= max; i++)
            {
                if(i > target)
                    break;
                count += helper(n-1, target-i);
                count %= mod;
            }
            dp[n][target] = count;
        }
        return dp[n][target];
    }
}