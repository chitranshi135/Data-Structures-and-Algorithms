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
                prices[i]=sc.nextLong();
            }
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long maximumProfit(long prices[], int N){
        long[][] dp = new long[N+2][2];
        // for(long row[]: dp)
        //     Arrays.fill(row,-1);
        // dp[N][0] = 0;
        // dp[N][1] = 0;
        for(int i = N-1; i >= 0; i--)
        {
            for(int prevBuy = 0; prevBuy <= 1; prevBuy++)
            {
                long profit = 0;
                    
                if(prevBuy == 1)
                {
                    profit = Math.max(prices[i]+dp[i+2][0], dp[i+1][1]);
                }
                else
                {
                    profit = Math.max(-1*prices[i]+dp[i+1][1], dp[i+1][0]);
                }
                    dp[i][prevBuy] = profit;
            }
        }
        return dp[0][0];
    }
}
