class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[59];
        if(n <= 3)
            return n-1;
        return solve(n, dp);
    }
    
    public int solve(int n, int[] dp) {
        if(n <= 3){
            return n;
        }
        if(dp[n] != 0)
            return dp[n];
        int max = -1;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, i*solve(n-i, dp));
        }
        
        return dp[n] = max;
    }
}