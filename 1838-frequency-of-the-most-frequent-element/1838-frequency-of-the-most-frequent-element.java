class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 1;
        long sum = 0L;
        int i = 0, j = 0;
        int n = nums.length;
        while(j < n)
        {
            sum += nums[j];
            while((long)nums[j]*(j-i+1)-sum > (long)k)
            {
                sum = sum - nums[i];
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}