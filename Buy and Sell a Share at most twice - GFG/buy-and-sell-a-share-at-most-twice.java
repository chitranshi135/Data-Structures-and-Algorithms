//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

//RECURSIVE CODE

// class Solution {
//     public static int maxProfit(int n, int[] price) {
//         return helper(price, n, 0, 0, 2);
//     }
    
//     public static int helper(int[] price, int n, int i, int prevBuy, int transaction){
//         if(transaction == 0)
//             return 0;
//         if(i == n)
//             return 0;
        
//         int profit = 0;
        
//         if(prevBuy == 0)
//         {
//             profit = Math.max(-1*price[i]+helper(price, n, i+1, 1, transaction), helper(price, n, i+1, 0, transaction));
//         }
//         else
//         {
//             profit = Math.max(price[i]+helper(price, n, i+1, 0, transaction-1), helper(price, n, i+1, 1, transaction));
//         }
//         return profit;
//     }
// }
        

//memoization solution-top down
// class Solution {
//     public static int maxProfit(int n, int[] price) {
//         int[][][]  dp = new int[n][2][3];
//         for(int[][] mat : dp)
//         {
//             for(int[] row : mat)
//             {
//                 Arrays.fill(row, -1);
//             }
//         }
//         return helper(price, n, 0, 0, 2, dp);
//     }
    
//     public static int helper(int[] price, int n, int i, int prevBuy, int transaction, int[][][] dp){
//         if(transaction == 0)
//             return 0;
//         if(i == n)
//             return 0;
        
//         if(dp[i][prevBuy][transaction] != -1)
//             return dp[i][prevBuy][transaction];
        
//         int profit = 0;
        
//         if(prevBuy == 0)
//         {
//             profit = Math.max(-1*price[i]+helper(price, n, i+1, 1, transaction, dp), helper(price, n, i+1, 0, transaction, dp));
//         }
//         else
//         {
//             profit = Math.max(price[i]+helper(price, n, i+1, 0, transaction-1, dp), helper(price, n, i+1, 1, transaction, dp));
//         }
//         return dp[i][prevBuy][transaction] = profit;
//     }
// }
        

//bottom up solution
class Solution
{
    public static int maxProfit(int n, int[] price) {
        int[][] ahead = new int[2][3];
        int[][] curr = new int[2][3];
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
                for(int transaction = 1; transaction <= 2; transaction++)
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
        return curr[0][2];
    }
}