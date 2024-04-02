class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maxXOR = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(Math.abs(nums[i]-nums[j]) <= Math.min(nums[i], nums[j])){
                    int curr = nums[i] ^ nums[j];
                    if(curr > maxXOR)
                        maxXOR = curr;
                }
            }
        }
        return maxXOR;
    }
}