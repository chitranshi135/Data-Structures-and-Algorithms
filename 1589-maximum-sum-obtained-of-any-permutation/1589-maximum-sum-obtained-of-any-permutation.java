class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] r) {
        int n = nums.length;
        int[] idx = new int[n];
        for(int i = 0; i < r.length; i++)
        {
            idx[r[i][0]]++; 
            if(r[i][1]+1 < n)
                idx[r[i][1]+1]--;
        }
        
        int active = 0;
        for(int i = 0; i < n; i++)
        {
            //add or remove any requests
            active = active + idx[i];
            //update in array
            idx[i] = active;
        }
        
        Arrays.sort(idx);
        Arrays.sort(nums);
        int mod = (int)Math.pow(10, 9)+7;
        long res = 0;
        for(int i = n-1; i >= 0; i--)
        {
            res = (res + (((1L * idx[i]) % mod)* nums[i]) % mod) % mod;
        }
        return (int)res;
    }
}