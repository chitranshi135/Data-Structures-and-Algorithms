class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = n-1;
        int count = 0;
        for(int i = n-1; i >= 0; i--)
        {
            if(nums[j] > nums[i])
            {
                j--;
                count++;
            }
        }
        return count;
    }
}