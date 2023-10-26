//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    boolean dfs(int i, int V, List<List<Integer>> adj, boolean[] vis, boolean[] pathVis, boolean[] check) {
        vis[i] = true;
        pathVis[i] = true;
        check[i] = false;
        
        for(int x : adj.get(i)){
            if(!vis[x]){
                if(dfs(x, V, adj, vis, pathVis, check))
                    return true;
            }
            else {
                if(pathVis[x])
                    return true;
            }
        }
        pathVis[i] = false;
        check[i] = true;
        return false;
    }
    
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];
        boolean[] check = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(!vis[i])
                dfs(i, V, adj, vis, pathVis, check);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < V; i++){
            if(check[i])
                ans.add(i);
        }
        return ans;
    }
}
