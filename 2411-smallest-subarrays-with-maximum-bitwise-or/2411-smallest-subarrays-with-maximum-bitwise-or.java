class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] last = new int[32];
        
        for(int i = n-1; i >= 0; i--)
        {
            //at worst, subarray will have only this element
            ans[i] = 1;
            for(int j = 0; j < 32; j++)
            {
                if((nums[i] & (1 << j)) > 0)
                    last[j] = i;
                //answer will be the max of distances of all prev set bits
                ans[i] = Math.max(ans[i], last[j]-i+1);
            }
        }
        return ans;
    }
}