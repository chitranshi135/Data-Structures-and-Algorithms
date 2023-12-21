class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int i = 0, j = 1, n = nums.length;
        while(j < n){
            if(nums[j] > nums[j-1])
                j++;
            else{
                max = Math.max(max, j-i);
                i = j;
                j++;
            }
        }
        return Math.max(max, j-i);
    }
}