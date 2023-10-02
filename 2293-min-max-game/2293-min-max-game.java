class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        int[] temp = new int[n/2];
        for(int i = 0; i < temp.length; i++)
        {
            if(i % 2 == 0)
                temp[i] = Math.min(nums[2*i], nums[2*i+1]);
            else
                temp[i] = Math.max(nums[2*i], nums[2*i+1]);
        }
        return minMaxGame(temp);
    }
}