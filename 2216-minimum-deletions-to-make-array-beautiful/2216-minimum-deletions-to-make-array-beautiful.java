class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        int size = 0;
        int prev = -1;
        for(int i = 0; i < n; i++)
        {
            if(size % 2 == 1)
            {
                //prev index ws even
                if(nums[i] != prev)
                {
                    prev = nums[i];
                    size++;
                }
            }
            else
            {
                prev = nums[i];
                size++;
            }
        }
        return size%2 == 0? n-size: n-size+1;
    }
}