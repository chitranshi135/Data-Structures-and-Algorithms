class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] vis = new boolean[n+1];
        solve(1, n, vis);
        return count;
    }
    
    public void solve(int idx, int n, boolean[] vis) {
        if(idx > n)
        {
            count++;
            return;
        }
        
        for(int i = 1; i <= n; i++) {
            if(!vis[i]){
                if(idx % i == 0 || i % idx == 0){
                    vis[i] = true;
                    solve(idx+1, n, vis);
                    vis[i] = false;
                }
            }
        }
    }
}