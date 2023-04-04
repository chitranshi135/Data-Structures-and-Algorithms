class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < j)
        {
            if((-1*nums[i]) == nums[j])
                return Math.abs(nums[i]);
            else if(Math.abs(nums[i]) < Math.abs(nums[j]))
                j--;
            else
                i++;
        }
        return -1;
    }
}