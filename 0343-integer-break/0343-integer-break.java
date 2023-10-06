class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[59];
        if(n <= 3)
            return n-1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n; i++){
            int max = i;
            for(int j = 1; j < i; j++){
                max = Math.max(max, j*dp[i-j]);
            }
            dp[i] = max;
        }
        return dp[n];
    }
}