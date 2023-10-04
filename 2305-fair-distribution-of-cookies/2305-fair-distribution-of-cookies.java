class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int[] curr = new int[k];
        int[] res = {Integer.MAX_VALUE};
        solve(0, cookies, curr, res);
        return res[0];
    }
    
    public void solve(int idx, int[] cookies, int[] curr, int[] res) {
        if(idx == cookies.length)
        {
            int max = -1;
            for(int x: curr)
                max = Math.max(max, x);
            res[0] = Math.min(res[0], max);
            return;
        }
        
        for(int i = 0; i < curr.length; i++)
        {
            curr[i] += cookies[idx];
            if(curr[i] < res[0])
                solve(idx+1, cookies, curr, res);
            curr[i] -= cookies[idx];
        }
    }
}