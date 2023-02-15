//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String S = br.readLine().trim();
            String[] S1 = S.split(" ");
            int n = Integer.parseInt(S1[0]);
            int amount  = Integer.parseInt(S1[1]);
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.MinCoin(nums, amount);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MinCoin(int[] coins, int v)
    {
        
        //if(v == 0)
	   //    return 0;
	   //if(n == 0)
	   //    return Integer.MAX_VALUE-1;
	   //if(coins[n-1] <= v)
	   //{
	   //    return Math.min(cal(coins, n, v - coins[n-1])+1, cal(coins, n-1, v));
	   //}
	   //return cal(coins, n-1,v);
	   int n = coins.length;
	   int[][] dp = new int[n+1][v+1];
	   int i, j;
	   i = 0;
	   for(j = 1; j <= v; j++)
	       dp[i][j] = Integer.MAX_VALUE - 1;
	   //i = 1;
	   //for(j = 0; j <= v; j++)
	   //{
	   //    if(j % coins[i-1] == 0)
	   //        dp[i][j] = j/coins[i-1];
	   //    else
	   //        dp[i][j] = Integer.MAX_VALUE - 1;
	   //}
	   for(i = 1; i <= n; i++)
	   {
	       for(j = 1; j <= v; j++)
	       {
	           if(coins[i-1] <= j)
	               dp[i][j] = Math.min(dp[i][j-coins[i-1]]+1, dp[i-1][j]);
	           else
	               dp[i][j] = dp[i-1][j];
	       }
	   }
	   if(dp[n][v] == Integer.MAX_VALUE-1)
	       return -1;
	   return dp[n][v];
	} 
    
}