class Solution {
    public int longestSubarray(int[] nums) {
        //AND of any numbers is always less than the max among them
        //therefore the max AND will be in the subarray containing the max element of array
        
        int max = 0;
        int curr = 0, longest = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == max)
            {
                curr++;
                longest = Math.max(longest, curr);
            }
            
            else if(nums[i] > max)
            {
                max = nums[i];
                curr = 1;
                longest = 1;
            }
            
            else
                curr = 0;
        }
        return longest;
    }
}