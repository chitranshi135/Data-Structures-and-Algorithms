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
            int fee=sc.nextInt();
            Solution obj=new Solution();
            long res=obj.maximumProfit(prices,N,fee);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public long maximumProfit(long prices[], int N, int fee){
        long[] ahead = new long[2];
        // for(long row[]: dp)
        //     Arrays.fill(row,-1);
        ahead[0] = 0;
        ahead[1] = 0;
        
        long[] curr = new long[2];
        for(int i = N-1; i >= 0; i--)
        {
            curr[1] = Math.max(prices[i]+ahead[0], ahead[1]);
            curr[0] = Math.max(-1*prices[i]+ahead[1]-fee, ahead[0]);
            
            ahead = curr;
        }
        return curr[0];
    }
}