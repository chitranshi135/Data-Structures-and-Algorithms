//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int n, int[][] pre)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        
        //using bfs
        //if topological sort cannot be generated, means cycle is present
        int[] indegree = new int[n];
        for(int i = 0; i < pre.length; i++)
        {
            adj.get(pre[i][1]).add(pre[i][0]);
            indegree[pre[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int x = 0; x < n ; x++)
        {
            if(indegree[x] == 0)
                q.add(x);
        }
        //no of vertices in topo sort
        int count = 0;
        while(!q.isEmpty())
        {
            int v = q.poll();
            count++;
            for(int x : adj.get(v))
            {
                indegree[x]--;
                if(indegree[x] == 0)
                    q.add(x);
            }
        }
        return count == n;
    }
    
}