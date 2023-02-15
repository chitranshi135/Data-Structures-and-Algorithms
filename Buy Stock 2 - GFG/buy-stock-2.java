//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            long []prices=new long[N];
            for(int i=0;i<N;i++){
                prices[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


//RECURSIVE APPROACH
// class Solution{
//     public long maximumProfit(long prices[], int N){
//         return helper(prices, 0, N, false);
//     }
//     public long helper(long prices[], int i, int N, boolean prevBuy)
//     {
//         long profit = 0;
//         //if any stock had been bought but not sold till this point,
//         //then at ending array, it will give 0 as max(-stock(unsold), 0) = 0
//         if(i == N)
//             return 0;
            
            
//         if(prevBuy)
//         {
//             profit = Math.max(prices[i]+helper(prices, i+1, N, false), helper(prices, i+1, N, true));
//         }
//         else
//         {
//             profit = Math.max(-1*prices[i]+helper(prices, i+1, N, true), helper(prices, i+1, N, false));
//         }
//         return profit;
//     }
// }


//TOP-DOWN APPROACH
// class Solution{
//     public long maximumProfit(long prices[], int N){
//         long[][] dp = new long[N][2];
//
//         for(long[] row : dp)
//             Arrays.fill(row, -1);
//         return helper(prices, 0, N, 0, dp);
//     }
//     public long helper(long prices[], int i, int N, int prevBuy, long[][] dp)
//     {
//         long profit = 0;
//         //if any stock had been bought but not sold till this point,
//         //then at ending array, it will give 0 as max(-stock(unsold), 0) = 0
//         if(i == N)
//             return 0;
        
//         if(dp[i][prevBuy] != -1)
//             return dp[i][prevBuy];
            
//         if(prevBuy == 1)
//         {
//             profit = Math.max(prices[i]+helper(prices, i+1, N, 0, dp), helper(prices, i+1, N, 1, dp));
//         }
//         else
//         {
//             profit = Math.max(-1*prices[i]+helper(prices, i+1, N, 1, dp), helper(prices, i+1, N, 0, dp));
//         }
//         return dp[i][prevBuy] = profit;
//     }
// }

//BOTTOM-UP APPROACH
// class Solution{
//     public long maximumProfit(long prices[], int N){
//         long[][] dp = new long[N+1][2];
//         // for(long row[]: dp)
//         //     Arrays.fill(row,-1);
//         dp[N][0] = 0;
//         dp[N][1] = 0;
//         for(int i = N-1; i >= 0; i--)
//         {
//             for(int prevBuy = 0; prevBuy <= 1; prevBuy++)
//             {
//                 long profit = 0;
                
//                 if(prevBuy == 1)
//                 {
//                     profit = Math.max(prices[i]+dp[i+1][0], dp[i+1][1]);
//                 }
//                 else
//                 {
//                     profit = Math.max(-1*prices[i]+dp[i+1][1], dp[i+1][0]);
//                 }
//                 dp[i][prevBuy] = profit;
//             }
//         }
//         return dp[0][0];
//     }
// }


//SPACE OPTIMISED
class Solution{
    public long maximumProfit(long prices[], int N){
        long[] ahead = new long[2];
        // for(long row[]: dp)
        //     Arrays.fill(row,-1);
        ahead[0] = 0;
        ahead[1] = 0;
        
        long[] curr = new long[2];
        for(int i = N-1; i >= 0; i--)
        {
            for(int prevBuy = 0; prevBuy <= 1; prevBuy++)
            {
                long profit = 0;
                
                if(prevBuy == 1)
                {
                    profit = Math.max(prices[i]+ahead[0], ahead[1]);
                }
                else
                {
                    profit = Math.max(-1*prices[i]+ahead[1], ahead[0]);
                }
                curr[prevBuy] = profit;
            }
            ahead = curr;
        }
        return curr[0];
    }
}