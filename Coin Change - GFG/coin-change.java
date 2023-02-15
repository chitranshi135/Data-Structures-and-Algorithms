//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int s[], int m, int n) {
        int i, j;
        long[][] dp = new long[m+1][n+1];
        for(i = 0; i <= m; i++)
        {
            dp[i][0] = 1;
        }
        for(i = 1; i <= m; i++)
        {
            for(j = 1; j <= n; j++)
            {
                if(s[i-1] <= j)
                    dp[i][j] = dp[i][j-s[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[m][n];
	} 
    
}