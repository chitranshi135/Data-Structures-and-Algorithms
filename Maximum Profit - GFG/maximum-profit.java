//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int k, int n, int price[]) {
        int[][] ahead = new int[2][k+1];
        int[][] curr = new int[2][k+1];
        // for(int i = 0; i < n; i++)
        // {
        //     for(int prevBuy = 0; prevBuy <= 1; prevBuy++)
        //     {
        //         dp[i][prevBuy][0] = 0;
        //     }
        // }
        
        // for(int prevBuy = 0; prevBuy <= 1; prevBuy++)
        // {
        //     for(int transaction = 2; transaction >= 0; transaction--)
        //         dp[n][prevBuy][transaction] = 0;
        // }
        
        for(int i = n-1; i >= 0; i--)
        {
            for(int prevBuy = 1; prevBuy >= 0; prevBuy--)
            {
                //but for every transaction=0 is base case, so start from 1
                for(int transaction = 1; transaction <= k; transaction++)
                {
                    int profit = 0;
        
                    if(prevBuy == 0)
                    {
                        profit = Math.max(-1*price[i]+ahead[1][transaction], ahead[0][transaction]);
                    }
                    else
                    {
                        profit = Math.max(price[i]+ahead[0][transaction-1], ahead[1][transaction]);
                    }

                    curr[prevBuy][transaction] = profit;
                }
            }
            ahead = curr;
        }
        return curr[0][k];
    }
}