class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n-2; i++)
        {
            int k = n-1, j = i+1;
            while(j < k)
            {
                int curr = nums[i]+nums[j]+nums[k];
                if(curr == target)
                    return curr;
                else if(curr < target)
                    j++;
                else
                    k--;
                
                int diff = Math.abs(curr-target);
                if(diff < minDiff)
                {
                    minDiff = diff;
                    sum = curr;
                }
            }
        }
        return sum;
    }
}