//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int n, ArrayList<ArrayList<Integer>> adj) {
        //using bfs
        //if topological sort cannot be generated, means cycle is present
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++)
        {
            for(int x : adj.get(i))
                indegree[x]++;
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
        if(count == n)
            return false;
        return true;
    }
}