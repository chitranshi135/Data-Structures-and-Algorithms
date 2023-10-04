class Solution {
    int[] curr;
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        curr = new int[k];
        solve(0, cookies);
        return res;
    }
    
    public void solve(int idx, int[] cookies) {
        if(idx == cookies.length)
        {
            int max = 0;
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
            //remove repeating subset
            if(curr[i] == 0)
                break;
        }
    }
}