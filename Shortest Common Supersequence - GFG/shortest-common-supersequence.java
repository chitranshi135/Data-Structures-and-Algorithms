//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int l = lcs(m, n, X, Y);
        return l + (m-l) + (n-l);
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp = new int[x+1][y+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return helper(x, y, s1, s2, dp);
    }
    static int helper(int x, int y, String s1, String s2, int[][] dp)
    {
        if(x == 0 || y == 0)
            return 0;
        if(dp[x][y] != -1)
            return dp[x][y];
        
        if(s1.charAt(x-1) == s2.charAt(y-1))
            dp[x][y] = helper(x-1, y-1, s1, s2, dp) + 1;
        else
            dp[x][y] = Math.max(helper(x-1, y, s1, s2, dp), helper(x, y-1, s1, s2, dp));
        return dp[x][y];
    }
}