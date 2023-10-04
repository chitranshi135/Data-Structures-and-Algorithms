class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] curr = new int[k];
        int[] res = {Integer.MAX_VALUE};
        solve(0, cookies, curr, res, 0);
        return res[0];
    }
    
    public void solve(int idx, int[] cookies, int[] curr, int[] res, int max) {
        if(idx == cookies.length)
        {
            res[0] = Math.min(res[0], max);
            return;
        }
        
        for(int i = 0; i < curr.length; i++)
        {
            curr[i] += cookies[idx];
            if(curr[i] < res[0])
                solve(idx+1, cookies, curr, res, Math.max(max, curr[i]));
            curr[i] -= cookies[idx];
        }
    }
}