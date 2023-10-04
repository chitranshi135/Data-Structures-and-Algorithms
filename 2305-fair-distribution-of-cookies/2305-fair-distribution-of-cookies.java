class Solution {
    int[] curr;
    int res;
    public int distributeCookies(int[] cookies, int k) {
        curr = new int[k];
        res = Integer.MAX_VALUE;
        solve(0, cookies);
        return res;
    }
    
    public void solve(int idx, int[] cookies) {
        if(idx == cookies.length)
        {
            int max = -1;
            for(int x: curr)
                max = Math.max(max, x);
            res = Math.min(res, max);
            return;
        }
        
        for(int i = 0; i < curr.length; i++)
        {
            curr[i] += cookies[idx];
            if(curr[i] < res)
                solve(idx+1, cookies);
            curr[i] -= cookies[idx];
        }
    }
}