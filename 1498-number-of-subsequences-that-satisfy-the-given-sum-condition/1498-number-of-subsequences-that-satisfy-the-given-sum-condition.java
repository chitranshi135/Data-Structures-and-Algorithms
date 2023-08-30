class Solution {
    final int MOD = 1000000007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        //calculating powers of 2
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i = 1; i < n; i++)
            pow[i] = (pow[i-1]*2) % MOD;
        
        int i = 0, j = n-1;
        while(i <= j){
            //count possible subsequences with nums[i] as minimum
            if(nums[i]+nums[j] <= target){
                ans = (ans + pow[j-i]) % MOD;
                i++;
            }
            else
                j--;
        }
        return ans;
    }
}