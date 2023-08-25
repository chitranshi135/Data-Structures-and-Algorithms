class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length() != s3.length())
            return false;
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
        return isPossible(s1, s2, s3, 0, 0, 0, dp);
    }
    public boolean isPossible(String s1, String s2, String s3, int i1, int i2, int i3, Boolean[][] dp){
        if(i3 == s3.length())
            return true;
        if(dp[i1][i2] != null)
            return dp[i1][i2];
        boolean b1 = false, b2 = false;
        if(i1 < s1.length() && s3.charAt(i3) == s1.charAt(i1))
            b1 = isPossible(s1, s2, s3, i1+1, i2, i3+1, dp);
        if(i2 < s2.length() && s3.charAt(i3) == s2.charAt(i2))
            b2 = isPossible(s1, s2, s3, i1, i2+1, i3+1, dp);
        return dp[i1][i2] = b1 | b2;
    }
}