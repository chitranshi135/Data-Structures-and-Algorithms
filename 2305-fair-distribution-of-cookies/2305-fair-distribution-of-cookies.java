class Solution {
    int ans = Integer.MAX_VALUE;
    int count[];
    public int distributeCookies(int[] cookies, int k) {
        count = new int[k];
        backtrack(cookies, 0, k);
        return ans;
    }

    public void backtrack(int[] cookies, int index, int k) {
        if(cookies.length == index) {
            int max = 0;
            for(int i = 0; i < k; i++) max = Math.max(max, count[i]);
            ans = Math.min(ans, max);
            return;
        }
        for(int i = 0; i < k; i++) {
            count[i] += cookies[index];
            backtrack(cookies, index + 1, k);
            count[i] -= cookies[index];
            if(count[i] == 0) break;
        }
        return;
    }
}