class Solution {
    public int subsetXORSum(int[] nums) {
        int[] sum = new int[1];
        int[] xor = new int[1];
        solve(nums, 0, sum, xor);
        return sum[0];
    }
    
    public void solve(int[] nums, int i, int[] sum, int[] xor) {
        if(i == nums.length){
            sum[0] += xor[0];
            return;
        }
        
        //take
        xor[0] ^= nums[i];
        solve(nums, i+1, sum, xor);
        
        //not take
        xor[0] ^= nums[i];
        solve(nums, i+1, sum, xor);
    }
}