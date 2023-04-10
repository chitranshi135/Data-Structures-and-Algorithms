class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n/2;
        int c = 0;
        while(i < n/2 && j < n)
        {
            if(nums[i]*2 <= nums[j])
            {
                i++;
                j++;
                c += 2;
            }
            else
                j++;
        }
        return c;
    }
}