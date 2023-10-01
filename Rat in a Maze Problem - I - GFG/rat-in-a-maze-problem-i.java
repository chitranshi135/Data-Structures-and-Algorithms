//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        if(m[0][0] == 1)
            solve(0, 0, m, n, vis, ans, "");
        return ans;
    }
    
    public static void solve(int i, int j, int[][] m, int n, boolean[][] vis, ArrayList<String> ans, String curr) {
        if(i == n-1 && j == n-1)
        {
            ans.add(curr);
            return;
        }
        
        //downward
        if(i+1 < n && !vis[i+1][j] && m[i+1][j] == 1){
            vis[i][j] = true;
            solve(i+1, j, m, n, vis, ans, curr+"D");
            vis[i][j] = false;
        }
        //left
        if(j-1 >= 0 && !vis[i][j-1] && m[i][j-1] == 1){
            vis[i][j] = true;
            solve(i, j-1, m, n, vis, ans, curr+"L");
            vis[i][j] = false;
        }
        //right
        if(j+1 < n && !vis[i][j+1] && m[i][j+1] == 1){
            vis[i][j] = true;
            solve(i, j+1, m, n, vis, ans, curr+"R");
            vis[i][j] = false;
        }
        //upward
        if(i-1 >= 0 && !vis[i-1][j] && m[i-1][j] == 1){
            vis[i][j] = true;
            solve(i-1, j, m, n, vis, ans, curr+"U");
            vis[i][j] = false;
        }
    }
}